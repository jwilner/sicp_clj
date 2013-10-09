(ns sicp-clj.exc_1_16
  (:use [sicp-clj.exc_1_3 :only [square]]))

(defn iter-exponent [a b n]
  (do 
    (println a b n)
    (cond
      (= n 0) a
      (even? n) (recur a (square b) (/ n 2))
      :else (recur (* a b) b (dec n)))))

(defn it-exp [b n]
  (iter-exponent 1 b n))

(it-exp 3 7)
