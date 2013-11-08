(ns sicp-clj.exc_1_29
  (:use [sicp-clj.example_procedures_as_args :only [integral cube]]))

(integral cube 0 1 0.01)
(integral cube 0 1 0.001)

(defn simpson-integral [f a b n]
  (let [h (/ (- b a) n)
        y-coeff  #(cond
                   (or (zero? %) (= n %)) 1
                   (even? %) 2
                   :else 4)]
     (loop [k 0
            acc 0]
       (if (> k n) 
         (* acc (/ h 3)) 
         (recur (inc k) (+ acc
                           (* (y-coeff k)
                              (f (+ a (* k h))))))))))

(simpson-integral cube 0 1 100)
(simpson-integral cube 0 1 1000)

