(ns sicp-clj.exc_1_20 
  (:use [sicp-clj.exc_1_6 :only [new-if]]))

(defn euclid-gcd 
  "Traditional GCD implementation"
  [a b]
  (if (= b 0)
    a
    (recur b (mod a b))))

(defn new-euclid-gcd 
  "Busted GCD thanks to normal order expansion"
  [a b]
  (do 
    (println a b)
    (new-if (= b 0)
      a
      (new-euclid-gcd b (mod a b)))))

(euclid-gcd 206 40)
(euclid-gcd 40 6)
(euclid-gcd 6 4)
(euclid-gcd 4 2)
(euclid-gcd 2 0)

(new-euclid-gcd 206 40)
;; division by zero error because normal order keeps trying to expand 
;; new-if arguments and freaks out. Why does SICP think this is edifying at 
;; this point? We've been over this. Da jerks.
