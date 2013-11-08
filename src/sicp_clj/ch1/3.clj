(ns sicp-clj.ch1.3)

(defn square [x] (* x x))
(defn square-two [x y] (+ (square x) (square y)))

(defn my-max [x y]
  (if (< x y)
    y
    x))

"fn(1,1,3) -> (1**2)+(3**2)"

(defn square-two-biggest [a b c]
  (if (= (max a b) a)
    (square-two a (max b c))
    (square-two b (max a c))))


