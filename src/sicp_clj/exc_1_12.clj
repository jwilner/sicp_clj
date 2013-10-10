(ns sicp-clj.exc_1_12)

(defn pascal [x y]
  (cond
    (and (= x 0) (= y 0)) 1
    (or (> y x) (< y 0)) 0
    :else (+ (pascal (dec x) (dec y))
             (pascal (dec x) y))))

(defn p [limit]
    (defn p-loop [row col]
        (println (pascal row col))
        (cond
          (and (= row limit) (= col limit)) nil
          (= row col) (p-loop (inc row) 0)
          :else (p-loop row (inc col))))
    (p-loop 0 0))

(p 4)
