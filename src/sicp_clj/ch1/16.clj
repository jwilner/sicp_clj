(ns sicp-clj.ch1.16
  (:use [sicp-clj.ch1.3 :only [square]]))

(defn fast-expt 
    "exponentiation in constant space and logarithmic time"
    ([b n] (fast-expt 1 b n))
    ([a b n]
    (cond
      (= n 0) a
      (even? n) (recur a (square b) (/ n 2))
      :else (recur (* a b) b (dec n)))))
(fast-expt 16 2)
(fast-expt 4 5)
