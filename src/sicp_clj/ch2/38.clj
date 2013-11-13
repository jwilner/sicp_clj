(ns sicp-clj.ch2.38
  (:use [sicp-clj.ch2.my-pretend-HOF :rename {accumulate fold-right}]))

(defn fold-left
  [op init a-seq]
  (loop [result init
         remaining a-seq]
    (if-not (seq remaining)
      result
      (recur (op result (first remaining))
             (rest remaining)))))

(fold-right / 1 '(1 2 3))
;; 3/2

(fold-left / 1 '(1 2 3))
;; 1/6

(fold-right list nil '(1 2 3))
;; (1 (2 (3 nil)))

(fold-left list nil '(1 2 3))
;; (((nil 1) 2) 3)

