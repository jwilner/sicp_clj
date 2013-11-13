(ns sicp-clj.ch2.40
  (:use [sicp-clj.ch2.flatmap :only [flatmap]]
        [sicp-clj.ch1.fermat_test :only [fast-prime?]]))

(flatmap (fn [i]
           (map #(list i %)
                (range 1 i)))
         (range 2 6))

(defn prime-sum? [pair]
  (fast-prime? (+ (first pair) 
                  (last pair))
               5))

(defn make-prime-sum [pair]
  (
