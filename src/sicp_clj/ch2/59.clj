(ns sicp-clj.ch2.59
  (:use [sicp-clj.ch2.sets :only [element-of-set?]]))

(defn union-set
  [set1 set2]
  (cond (not (seq set1)) set2
        (element-of-set? (first set1) set2) (union-set (rest set1)
                                                       set2)
        :else (cons (first set1) (union-set (rest set1)
                                            set2))))

(union-set '(4 5 6) '(3 5 6))
