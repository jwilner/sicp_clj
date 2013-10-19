(ns sicp-clj.example_fixed_point 
  (:use [clojure.math.numeric-tower :as math]))

(def tolerance 0.00001)

(defn fixed-point [f first-guess]
  (let [close-enough? #(< (math/abs (- %1 %2)) tolerance)]
    (loop [guess first-guess]
      (let [next-guess (f guess)]
        (if (close-enough? guess next-guess)
          next-guess
          (recur next-guess))))))

(defn my-sqrt [x]
 (fixed-point #(/ (+ (/ x %) %) 2) 1.0)) 

(my-sqrt 4)
