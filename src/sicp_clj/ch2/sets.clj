(ns sicp-clj.ch2.sets )

(defn element-of-set?
  [x my-set]
  (cond (not (seq my-set)) false
        (= x (first my-set)) true
        :else (element-of-set? x (rest my-set))))

(defn adjoin-set
  [x my-set]
  (if (element-of-set? x my-set)
    my-set
    (cons x my-set)))

(defn intersection-set
  [set1 set2]
  (cond (or (not (seq set1)) (not (seq set2))) ()
        (element-of-set? (first set1) set2) (cons (first set1)
                                                  (intersection-set (rest set1)
                                                                    set2))
        :else (intersection-set (rest set1) set2)))

(element-of-set? 3 '(5 3 6))
(adjoin-set 3 '(5 3 6))
(adjoin-set 4 '(5 3 6))
(intersection-set '(4 5 6) '(3 5 6))
