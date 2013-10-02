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
