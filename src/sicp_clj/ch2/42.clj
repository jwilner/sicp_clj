(ns sicp-clj.ch2.42
  (:import java.lang.Math)
  (:use [sicp-clj.ch2.flatmap :only [flatmap]]))

(defn make-cell [x y]
  (list x y))

(defn get-col [cell]
  (first cell))

(defn get-row [cell]
  (last cell))

(def empty-board ())

(defn safe? [k positions]
  (let [in-same-col #(= k (get-col %))
        a-row (get-row (first (filter in-same-col
                                      positions)))
        others (remove in-same-col 
                       positions)] 
    (not-any? (fn [b]
                (let [b-row (get-row b)]
                   (or (= a-row b-row) ;; horizontals
                   (= (Math/abs (- a-row b-row)) ;; diagonals
                      (Math/abs (- k (get-col b)))))))
              others)))

(defn adjoin-position [new-row k rest-of-queens]
  (cons (make-cell k new-row) rest-of-queens))

(defn queens [board-size]
  (letfn [(queen-cols [k]
            (if (zero? k) 
              (list empty-board)
              (filter #(safe? k %)
                      (flatmap (fn [rest-of-queens]
                                (map #(adjoin-position % ;; new row
                                                       k
                                                       rest-of-queens)
                                      (range 1 (inc board-size))))
                                (queen-cols (dec k))))))]
    (queen-cols board-size)))

(count (queens 8))
