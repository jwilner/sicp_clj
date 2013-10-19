(ns sicp-clj.exc_1_38
  (:use [sicp-clj.exc_1_37 :only [cont-frac always-one]]))

(defn e-series-den [n]
  (if (= 2 (mod n 3))
    (* 2 (inc (quot n 3)))
    1))

(defn get-e 
  ([] (get-e 100))
  ([n]
    (+ 2 (cont-frac always-one e-series-den n))))

(get-e)
