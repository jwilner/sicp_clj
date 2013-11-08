(ns sicp-clj.ch1.1)

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

(def a 3);; I think this was originally 1. Oh well.
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


