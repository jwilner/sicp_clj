(ns sicp-clj.ch1.18 
  (:use [sicp-clj.ch1.17 :only [dubble halve]]))

(defn it-mult
  ([a b] (it-mult a b 0))
  ([a b acc]
    (cond 
      (= b 0) acc
      (even? b) (recur (dubble a) (halve b) acc)
      :else (recur a (dec b) (+ acc a)))))

(it-mult 2 8)
