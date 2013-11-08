(ns sicp-clj.ch2.exc7 )

(defn make-interval [a b]
  (list (min a b) (max a b)))

(defn lower-bound [interval]
  (first interval))

(defn upper-bound [interval]
  (last interval))

