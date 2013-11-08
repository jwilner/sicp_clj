(ns sicp-clj.ch1.45 
  (:import [java.lang.Math])
  (:use [clojure.math.numeric-tower :only [expt]]
        [sicp-clj.ch1.43 :only [repeat-denis
                                  repeated-with-compose 
                                  repeated 
                                  repeated-sicp-style]]
        [sicp-clj.ch1.average_damping :only [avg-damp]]
        [sicp-clj.ch1.fixed_point :only [fixed-point]]))

(defn sq-root [n]
  (fixed-point (repeated-with-compose (avg-damp #(/ n %) )
                         1)
               1.0))
(sq-root 9)

(defn cube-root [n]
  (fixed-point (repeat-denis (avg-damp #(/ n (* % %)))
                         1)
               1.0))

(cube-root 27)

(defn fourth-root [n]
  (fixed-point (repeated-with-compose (avg-damp #(/ n (* % % %)))
                         2)
               1.0))

(fourth-root 81)


(defn fifth-root [n]
  (fixed-point (repeat-denis (avg-damp #(/ n (* % % % %)))
                         4)
               1.0))

(fifth-root 243)

(defn sixth-root [n]
  (fixed-point (repeated (avg-damp #(/ n (* % % % % %)))
                         4)
               1.0))

(defn nth-root [x n]
  (let [damp (/ (java.lang.Math/log (double n)) (java.lang.Math/log 2.0))]
    (fixed-point 
      ((repeat-denis avg-damp damp)
        #(/ x 
            (expt % (dec n))))
     1.0)))

(nth-root 81 4)
