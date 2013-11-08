(ns sicp-clj.exc_1_6)

;;Exercise 1.6
(defn new-if [predicate then-clause else-clause]
  (cond predicate then-clause
        :else else-clause))
(new-if (= 2 3) 0 5)

;;(defn new-sqrt-iter [guess x]
;;  (new-if (good-enough? guess x)
;;        guess
;;        (recur (improve guess x)
;;                   x)))

;;(defn new-sqrt [x] (new-sqrt-iter 1.0 x))


