(ns sicp-clj.exc_1_24
  (:use [sicp-clj.exc_1_22 :only [prime-search-wrap]]
        [sicp-clj.example_fermat_test :only [fast-prime?]]))

(defn fast-prime-five? [n]
  (fast-prime? n 5))

(defn main [] (prime-search-wrap fast-prime-five?))
