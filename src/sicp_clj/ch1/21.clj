(ns sicp-clj.exc_1_21
  (:use [sicp-clj.exc_1_3 :only [square]]))

(defn smallest-divisor
  "This function finds the smallest factor of a given number"
  ([n] (smallest-divisor n inc 2))
  ([n next-divisor] (smallest-divisor n next-divisor 2))
  ([n next-divisor test-divisor]
    (cond (> (square test-divisor) n) n ;; so smallest factor of 'n' is 'n'
          (zero? (mod n test-divisor)) test-divisor ;; it goes in, so it's the smallest factor
          :else (recur n next-divisor (next-divisor test-divisor)))))

(smallest-divisor 199) ;; 199
(smallest-divisor 1999) ;; 1999
(smallest-divisor 19999) ;; 7

;; What was SICP's logic for defining a "divides?" function?
