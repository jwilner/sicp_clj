(ns sicp-clj.ch2.my-pretend-HOF
  (:use [sicp-clj.ch2.28 :only [fringe3]]))

(defn accumulate
  [op initial a-seq]
  (if (not (seq a-seq))
    initial
    (op (first a-seq)
        (accumulate op initial (rest a-seq)))))

(accumulate + 0 '(1 2 3 4 5))

(defn my-filter
  [predicate a-seq]
  (cond (not (seq a-seq)) nil
        (predicate (first a-seq)) (cons (first a-seq)
                                        (my-filter predicate
                                                   (rest a-seq))) 
        :else (my-filter predicate (rest a-seq))))

(my-filter odd? '(1 2 3 4 5))

(def enumerate-tree fringe3)
