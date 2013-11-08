(ns sicp-clj.ch1.half_interval_method
  (:require [clojure.math.numeric-tower :as math])
  (:use [sicp-clj.ch1.15 :only [sine]]))

(defn close-enough? [x y]
  (< (math/abs (- x y)) 0.0001))

(defn search [f neg-point pos-point]
  (let [midpoint (/ (+ neg-point pos-point) 2)]
    (if (close-enough? neg-point pos-point)
      midpoint
      (let [test-value (f midpoint)]
        (cond (pos? test-value) (recur f neg-point midpoint)
              (neg? test-value) (recur f midpoint pos-point)
              :else midpoint)))))

(defn half-interval-method [f a b]
  (let [a-value (f a)
        b-value (f b)]
    (cond (and (neg? a-value) (pos? b-value)) (search f a b)
          (and (neg? b-value) (pos? a-value)) (search f b a)
          :else (throw (Exception. (str "Values are not of opposite sign" a b))))))

(half-interval-method sine 2.0 4.0)
(half-interval-method #(- (* % % %) (* 2 %) 3) 1.0 2.0)

