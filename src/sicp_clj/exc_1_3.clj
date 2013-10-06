(ns sicp-clj.exc_1_3)

(defn square [x] (* x x))
(defn square-two [x y] (+ (square x) (square y)))

(defn square-two-biggest [a b c]
  (if (= (max a b) a)
    (square-two a (max b c))
    (square-two b (max a c))))


