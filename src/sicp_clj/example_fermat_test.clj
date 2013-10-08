(ns sicp-clj.example_fermat_test 
  (:use [sicp-clj.exc_1_3 :only [square]]))

(defn expmod
  "computes the remainder for 'base' to the 'exp' modulo 'm'" 
  [base exp m]
  (cond (= exp 0) 0
        (even? exp) (mod (square (expmod base (/ exp 2) m)) m)
        :else (mod (* base (expmod base (dec exp) m)) m)))

(defn fermat-test 
  "If 'n' is a prime number and 'a' is any positive integer less than 'n',
  then 'a' raised to the 'n'th power is congruent to 'a' modulo 'n'."
  [n]
  (do
    (defn try-it [a]
      (= (expmod a n n) a))
    (try-it (inc (rand-int (dec n))))))

(defn fast-prime? [n times]
  "fast-prime iterative function using the fermat-test"
  (cond (= times 0) true
        (fermat-test n) (fast-prime? n (dec times))
        :else false))

(fast-prime? 17 5)
