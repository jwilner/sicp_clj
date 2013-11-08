(ns sicp-clj.ch1.20 
  (:use [sicp-clj.ch1.6 :only [new-if]]))

(defn euclid-gcd 
  "Traditional GCD implementation"
  [a b]
  (if (zero? b)
    a
    (recur b (mod a b))))

