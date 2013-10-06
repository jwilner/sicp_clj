(ns sicp-clj.exc_1_5
  (:use [sicp-clj.exc_1_3 :only [square]]))

;; Exercise 1.5

;;"Newton's Method for Square Roots"
(defn abs [x] (if (< x 0) (- 0 x) x))




(defn good-enough? [guess x]
  (< (abs (- (square guess) x)) 0.001))
(defn average [x y]
  ( / (+ x y) 2))
(defn sqrt-iter [guess x]
  (defn improve [guess x]
    (average guess (/ x guess)))
  (if (good-enough? guess x)
    guess
    (recur (improve guess x)
           x)))

(defn sqrt [x] (sqrt-iter 1.0 x))

(sqrt 100)
;;end


