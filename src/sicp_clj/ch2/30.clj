(ns sicp-clj.ch2.30 )

(defn square [x] 
  (* x x))

(defn square-tree [tree]
  (cond (nil? tree) nil
        (not (list? tree)) (square tree)
        :else (cons (square-tree (first tree))
                    (square-tree (next tree)))))

(square-tree '())
(seq '())

(defn map-square-tree [tree]
  (map #(if (list? %)
          (map-square-tree %)
          (square %))
       tree))

(map-square-tree (list 1
                  (list 2
                        (list 3 4)
                        5)
                  (list 6 7)))

