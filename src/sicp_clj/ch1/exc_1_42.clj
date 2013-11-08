(ns sicp-clj.exc_1_42
  (:use [sicp-clj.exc_1_3 :only [square]]))

(defn compose [f g]
  #(f (g %)))

((compose square inc) 6) ;; 49
