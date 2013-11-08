(ns sicp-clj.ch1.average_damping
  (:use [sicp-clj.ch1.fixed_point :only [fixed-point]]))

(defn avg-damp [f]
  #(/ (+ (f %) %) 2))

(defn new-sqrt [x]
  (fixed-point (avg-damp #(/ x %)) 1.0))

(new-sqrt 9)


(defn cube-root [x]
  (fixed-point (avg-damp #(/ x (* % %))) 1.0))

(cube-root 27)
