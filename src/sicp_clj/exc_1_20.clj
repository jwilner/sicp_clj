(ns sicp-clj.exc_1_20 
  (:use [sicp-clj.exc_1_6 :only [new-if]]))

(defn euclid-gcd [a b]
  (if (= b 0)
    a
    (recur b (mod a b))))

(defn new-euclid-gcd [a b]
  (do 
    (println a b)
    (new-if (= b 0)
      a
      (new-euclid-gcd b (mod a b)))))

(new-euclid-gcd 206 40)
(euclid-gcd 206 40)
