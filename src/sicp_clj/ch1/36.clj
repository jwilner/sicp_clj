(ns sicp-clj.ch1.36
  (:import (java.lang.Math)))

(def tolerance 0.00001)

(defn fixed-point-print [f first-guess]
  (let [close-enough? #(< (Math/abs (- %1 %2)) tolerance)]
    (loop [guess first-guess]
      (do
        (println guess)
        (let [next-guess (f guess)]
          (if (close-enough? guess next-guess)
            next-guess
            (recur next-guess)))))))

(fixed-point-print #(/ (+ (/ 4 %) %) 2) 1.0)
(fixed-point-print #(+ 1 (/ 1 %)) 2.0)
(fixed-point-print #(/ (Math/log 1000) (Math/log %)) 5.0)
(fixed-point-print #(/ (Math/log 1000) (Math/log %)) 2.0)
