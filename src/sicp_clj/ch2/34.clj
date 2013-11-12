(ns sicp-clj.ch2.34
  (:use [sicp-clj.ch2.my-pretend-HOF :only [accumulate]]))

(defn horner-eval
  [x coeff-seq]
  (accumulate #(+ %1 (* %2 x))
              0
              coeff-seq))

(horner-eval 2 '(1 3 0 5 0 1))
