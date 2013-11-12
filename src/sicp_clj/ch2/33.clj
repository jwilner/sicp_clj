(ns sicp-clj.ch2.33
  (:use [sicp-clj.ch2.my-pretend-HOF :only [accumulate]]))

(defn my-map
  [p a-seq]
  (accumulate #(cons (p %1) %2)
              nil
              a-seq))

(defn append
  [seq1 seq2]
  (accumulate cons
              seq2
              seq1))

(defn length
  [a-seq]
  (accumulate #(inc %2)
              0
              a-seq))
