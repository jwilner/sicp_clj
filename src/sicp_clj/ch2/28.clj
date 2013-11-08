(ns sicp-clj.ch2.28
  (:use [sicp-clj.ch2.append :only [append]]))

(defn fringe3 [list1]
  (if (list? list1) 
    (append (fringe3 (first list1)) (fringe3 (next list1)))
    (if (nil? list1) 
      nil 
      (list list1))))

(fringe3 '(1 2 3 4))
(fringe3 '((1 2) (3 4)))
