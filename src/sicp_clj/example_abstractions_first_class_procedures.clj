(ns sicp-clj.example_abstractions_first_class_procedures
  (:use [sicp-clj.example_average_damping :only [avg-damp]]
        [sicp-clj.example_fixed_point :only [fixed-point]]))

(defn fixed-point-of-transform [g transform guess]
  (fixed-point (transform g) guess))

(defn newest-sqrt [x]
  (fixed-point-of-transform #(/ x %) avg-damp 1.0))

(newest-sqrt 81)
