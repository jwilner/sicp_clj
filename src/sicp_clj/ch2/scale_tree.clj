(ns sicp-clj.ch2.scale-tree )

(defn scale-tree [tree factor]
  (cond (nil? tree) nil
        (not (list? tree)) (* tree factor)
        :else (cons (scale-tree (first tree) factor)
                    (scale-tree (next tree) factor))))

(scale-tree (list 1
                  (list 2
                        (list 3 4)
                        5)
                  (list 6 7))
            10)

(defn map-scale-tree [tree factor]
  (map #(if (list? %)
          (map-scale-tree % factor)
          (* % factor))
       tree))

(map-scale-tree (list 1
                      (list 2
                            (list 3 4)
                            5)
                      (list 6 7))
                10)
