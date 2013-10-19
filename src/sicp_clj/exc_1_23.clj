(ns sicp-clj.exc_1_23
  (:use [sicp-clj.exc_1_21 :only [smallest-divisor]]
        [sicp-clj.exc_1_22 :only [prime-search-wrap]]))

(defn next-test-divisor
  "For somewhat optimizing series by only providing odds"
  [n]
  (if (= n 2)
    3
    (+ n 2)))

(defn somewhat-better-prime?
  "Only testing odds after 2 -- genius!"
  [n]
  (= n (smallest-divisor n next-test-divisor)))

(defn -main [] (prime-search-wrap somewhat-better-prime?))
