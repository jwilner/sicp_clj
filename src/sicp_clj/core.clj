(ns sicp-clj.core)

;;Exercise 1.1

10
;;10

(+ 5 3 4)
;;12

(- 9 1)
;; 8

(/ 6 2)
;; 3

(+ (* 2 4) (- 4 6))
;; 6

(def a 3)
;; sicp-clj.core/a

(def b (+ a 1))
;; ditto (but b = 2 is the point)

(+ a b (* a b))
;; 6 

(= a b)
;; false

(if (and (> b a) (< b (* a b)))
  b
  a)
;; 1, false by second condition

(cond (= a 4) 6
      (= b 4) (+ 6 7 a)
      :else 25)
;; 25

(+ 2 (if (> b a) b a))
;; 3

(* (cond 
     (> a b) a
     (< a b) b
     :else -1)
   (+ a 1))
;; 4

;; Exercise 1.2
(/ 
   (+ 5 4 
      (- 2
         (- 3
            (+ 6 (/ 4 5)))))
  (* 3 (- 6 2) (- 2 7)))
;; - 37 / 150

;; Exercise 1.3
(defn square [x] (* x x))
(defn square-two [x y] (+ (square x) (square y)))

(defn square-two-biggest [a b c]
  (if (= (max a b) a)
    (square-two a (max b c))
    (square-two b (max a c))))

;; Exercise 1.4
(defn a-plus-abs-b [a b]
  ((if (> b 0) + -) a b))

;; Effectively an absolute value construction -- take-away is the ability to 
;; choose operators

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

;;Exercise 1.6
(defn new-if [predicate then-clause else-clause]
  (cond predicate then-clause
        :else else-clause))
(new-if (= 2 3) 0 5)

;;(defn new-sqrt-iter [guess x]
;;  (new-if (good-enough? guess x)
;;        guess
;;        (recur (improve guess x)
;;                   x)))

;;(defn new-sqrt [x] (new-sqrt-iter 1.0 x))

;; Exercise 1.7


;;

;; Exercise 1.8
(defn cube-good-enough? [guess x]
  (< (abs (- (* guess guess guess) x)) 0.001))

(defn cube-improve [guess x]
  (/ (+ (/ x (square guess)) (* 2 guess)) 3))

(defn cube-iter [guess x]
  (if (cube-good-enough? guess x)
   guess
   (recur (cube-improve guess x) x)))

(cube-iter 1 8)
(type 100)
