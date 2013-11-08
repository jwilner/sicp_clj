(ns sicp-clj.ch2.27 )

(defn deep-reverse [list1 list2]
    (cond (not (list? list1)) list1
          (empty? list1) list2
          :else (deep-reverse (rest list1)
                              (cons (deep-reverse (first list1) '())
                                    list2))))

(deep-reverse '((4 3) 2 1) '())
 
