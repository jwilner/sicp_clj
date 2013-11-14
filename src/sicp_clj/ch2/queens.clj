(ns sicp-clj.ch2.queens
  (:use [sicp-clj.ch2.flatmap :only [flatmap]]))

(def num-queens 8)

(def empty-board []) 

(defn make-cell [x y]
  (list x y))

(defn get-col [cell]
  (first cell))

(defn get-row [cell]
  (last cell))

(defn my-abs [value]
  (if (neg? value)
    (- value)
    value))

(defn safe? [k positions]
  (let [a-row (get-row (first (filter #(= k 
                                          (get-col %))
                                      positions)))] 
    (filter (fn [b]
              (let [b-row (get-row b)]
                 (or (= a-row b-row) ;; horizontals
                     (= (my-abs (- a-row b-row)) ;; diagonals
                        (my-abs (- k (get-col b)))))))
            positions)))

(defn adjoin-position [new-row k rest-of-queens]
  (cons (make-cell new-row k)
        rest-of-queens))

(defn queens [board-size]
  (letfn [(queen-col [k]
            (if (zero? k)
              (list empty-board)
              (filter #(safe? k %)
                      (flatmap (fn [rest-of-queens]
                                (map #(adjoin-position % ;; new row
                                                      k
                                                      rest-of-queens)
                                      (range 1 board-size)))
                                (queen-col (dec k))))))]
    (queen-col board-size)))

(queens 8)
