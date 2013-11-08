(ns sicp-clj.exc_1_43
  (:use [sicp-clj.exc_1_42 :only [compose]]
        [sicp-clj.exc_1_3 :only [square]]))

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

(defn repeated-with-compose [f n]
 (do
   (defn with-compose [i new_f]
     (if (= i n)
       new_f
       (recur (inc i) (compose f new_f))))
   (with-compose 1 f)))

(defn repeat-denis [f n]
  (if (= n 1)
    #(f %)
    (compose f (repeat-denis f (dec n)))))

((repeated-with-compose square 2) 5)

((repeated-sicp-style square 2) 5)
