(ns sicp-clj.ch2.append )

(defn append [list1 list2]
  (if (nil? list1)
    list2
    (cons (first list1) (append (next list1) list2))))

(def squares (map #(* % %) '(1 2 3 4 5)))

(def odds (map #(+ 1 (* 2 %)) (range 5)))


(append squares odds)
