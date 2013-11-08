(ns sicp-clj.exc_1_46 
  (:import [java.lang.Math]))

(defn iterative-improve
  [good-enuf? impruv]
  (fn [guess]
    (let [next-guess (impruv guess)]
      (if (good-enuf? guess next-guess)
         next-guess
         (recur (impruv guess))))))

(defn sqrt [x]
  ((iterative-improve #(< (java.lang.Math/abs (- %1 %2)) 0.00001)
                      #(/ (+ (/ x %) %) 2))
    1.0))

(sqrt 2)
