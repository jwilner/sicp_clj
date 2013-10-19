(ns sicp-clj.exc_1_43
  (:use [sicp-clj.exc_1_3 :only [square]]))

(defn repeated [f n]
  (fn [x]
    (loop [i 0
           v x]
      (if (= i n)
        v
        (recur (inc i) (f v))))))

((repeated square 2) 5)

(defn repeated-sicp-style [f n]
  (do
    (defn repeat-helper [i v]
      (if (= i n)
        v
        (recur (inc i) (f v))))
    #(repeat-helper 0 %)))

((repeated-sicp-style square 2) 5)
