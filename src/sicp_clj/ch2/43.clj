(ns sicp-clj.ch2.43)

(flatmap 
  (fn [new-row]
    (map (fn [rest-of-queens]
           (adjoin-position new-row k rest-of-queens))
         (queen-cols (dec k)))
  (range 1 (inc board-size))))
