(ns sicp-clj.ch1.24
  (:use [sicp-clj.ch1.22 :only [prime-search-wrap]]
        [sicp-clj.ch1.fermat_test :only [fast-prime?]]))

(defn fast-prime-fermat [n]
  (fast-prime? n 3))

#_(defn main [] (prime-search-wrap fast-prime-five?))
