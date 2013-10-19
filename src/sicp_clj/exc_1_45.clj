(ns sicp-clj.exc_1_45 
  (:use [sicp-clj.exc_1_43 :only [repeated]]
        [sicp-clj.example_average_damping :only [avg-damp]]
        [sicp-clj.example_fixed_point :only [fixed-point]]))

(defn sq-root [n]
  (fixed-point (repeated (avg-damp #(/ n %) )
                         1)
               1.0))

(sq-root 9)

(defn cube-root [n]
  (fixed-point (repeated (avg-damp #(/ n (* % %)))
                         1)
               1.0))

(cube-root 27)

(defn fourth-root [n]
  (fixed-point (repeated (avg-damp #(/ n (* % % %)))
                         2)
               1.0))

(fourth-root 81)


(defn fifth-root [n]
  (fixed-point (repeated (avg-damp #(/ n (* % % % %)))
                         8)
               1.0))

(fifth-root 243)

(defn sixth-root [n]
  (fixed-point (repeated (avg-damp #(/ n (* % % % % %)))
                         4)
               1.0))

(sixth-root 729)
