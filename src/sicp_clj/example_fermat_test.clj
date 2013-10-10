(ns sicp-clj.example_fermat_test 
  (:use [sicp-clj.exc_1_3 :only [square]]))

(defn expmod
  "computes the remainder for 'base' to the 'exp' modulo 'm'" 
  [base exp m]
  (cond (zero? exp) 1
        (even? exp) (mod 
                      (square (expmod base (/ exp 2) m)) 
                      m)
        :else       (mod 
                      (* base (expmod base (dec exp) m))
                      m)))

(expmod 4 5 3)

(defn fermat-test 
  "If 'n' is a prime number and 'a' is any positive integer less than 'n',
  then 'a' raised to the 'n'th power is congruent to 'a' modulo 'n'."
  [n]
  (defn try-it [a]
    (= (expmod a n n) a))
  (try-it (inc (rand-int (dec n)))))

(defn fast-prime?
  "fast-prime iterative function using the fermat-test"
  [n times]
  (cond (zero? times) true
        (fermat-test n) (fast-prime? n (dec times))
        :else false))

(fermat-test 17)

(fast-prime? 17 5)
