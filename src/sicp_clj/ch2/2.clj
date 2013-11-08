(ns sicp-clj.ch2.2)

(defn make-point [x y]
  (list x y))

(defn y-point [point]
  (nth point 1))

(defn x-point [point]
  (nth point 0))

(defn make-segment [a b]
  (list a b))

(defn start-segment [seg]
  (nth seg 0))

(defn end-segment [seg]
  (nth seg 1))
