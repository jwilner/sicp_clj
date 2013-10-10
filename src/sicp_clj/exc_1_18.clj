(ns sicp-clj.exc_1_18 
  (:use [sicp-clj.exc_1_17 :only [dubble halve]]))

(defn it-mult [b n]
  (defn iter-mult [a b n]
    (cond 
      (= n 0) a
      (even? n) (recur a (dubble b) (halve n))
      :else (recur (+ a b) b (dec n))))
  (iter-mult 0 b n))

(it-mult 2 8)
