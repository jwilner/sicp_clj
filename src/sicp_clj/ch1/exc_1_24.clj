(ns sicp-clj.exc_1_24
  (:use [sicp-clj.exc_1_22 :only [prime-search-wrap]]
        [sicp-clj.example_fermat_test :only [fast-prime?]]))

(defn fast-prime-fermat [n]
  (fast-prime? n 3))

#_(defn main [] (prime-search-wrap fast-prime-five?))
