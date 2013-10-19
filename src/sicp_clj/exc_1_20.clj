(ns sicp-clj.exc_1_20 
  (:use [sicp-clj.exc_1_6 :only [new-if]]))

(defn euclid-gcd 
  "Traditional GCD implementation"
  [a b]
  (if (zero? b)
    a
    (recur b (mod a b))))

