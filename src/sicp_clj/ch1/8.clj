(ns sicp-clj.ch1.8
  (:use [sicp-clj.ch1.5 :only [abs]]
        [sicp-clj.ch1.3 :only [square]]))

;; Exercise 1.8
(defn cube-good-enough? [guess x]
  (< (abs (- (* guess guess guess) x)) 0.001))

(defn cube-improve [guess x]
  (/ (+ (/ x (square guess)) (* 2 guess)) 3))

(defn cube-iter [guess x]
  (if (cube-good-enough? guess x)
   guess
   (recur (cube-improve guess x) x)))

(cube-iter 1.0 8)
;; Using 1.0 instead of 1 forces into floating point, 
;; rather than super intense rational fraction


