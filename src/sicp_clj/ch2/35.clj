(ns sicp-clj.ch2.35
  (:use [sicp-clj.ch2.my-pretend-HOF :only [accumulate
                                            enumerate-tree]]
        [sicp-clj.ch2.33 :only [my-map]]))

(defn count-leaves
  [tree]
  (accumulate +
              0
              (my-map return-1 (enumerate-tree tree))))

(enumerate-tree '(1 2 3 4))
(enumerate-tree a-tree)
