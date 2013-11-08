(ns sicp-clj.ch2.21 )

(defn my-map [proc items]
  (if (empty? items)
    nil
    (cons (proc (first items))
          (my-map proc (rest items)))))

;; (square-list (list 1 2 3 4))
;; '(1 4 9 16)

#_(defn naive-square-list [items]
  (if (nil? items)
    nil
    (let [item (first items)]
      (cons (* item item)
            (naive-square-list (rest items))))))

(defn square-list [items]
  (my-map #(* % %) items))

;; (naive-square-list '(1 2 3 4 5))
(square-list '(1 2 3 4 5))
