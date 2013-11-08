(ns sicp-clj.exc_1_4 )

;; Exercise 1.4
(defn a-plus-abs-b [a b]
  ((if (> b 0) + -) a b))

;; Effectively an absolute value construction -- take-away is the ability to 
;; choose operators


