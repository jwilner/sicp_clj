(ns sicp-clj.ch2.18)

(defn my-reverse [a-list]
  (loop [new-list '()
         remaining a-list]
    (if (empty? remaining)
      new-list
      (recur (cons (first remaining) new-list)
             (rest remaining)))))

(my-reverse '(3 5 2))
