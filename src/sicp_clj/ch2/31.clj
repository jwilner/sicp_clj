(ns sicp-clj.ch2.31)

(defn map-tree [tree f]
  (map #(if (list? %)
          (map-tree % f)
          (f  %))
       tree))

(map-square-tree [tree]
   (map-tree tree #(* % %)))

(map-tree (list 1
                (list 2
                      (list 3 4)
                      5)
                (list 6 7))
          #(* % %))
