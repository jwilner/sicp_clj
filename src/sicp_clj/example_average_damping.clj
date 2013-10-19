(ns sicp-clj.example_average_damping
  (:use [sicp-clj.example_fixed_point :only [fixed-point]]))

(defn avg-damp [f]
  #(/ (+ (f %) %) 2))

(defn new-sqrt [x]
  (fixed-point (avg-damp #(/ x %)) 1.0))

(new-sqrt 9)


(defn cube-root [x]
  (fixed-point (avg-damp #(/ x (* % %))) 1.0))

(cube-root 27)
