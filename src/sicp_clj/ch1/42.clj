(ns sicp-clj.ch1.42
  (:use [sicp-clj.ch1.3 :only [square]]))

(defn compose [f g]
  #(f (g %)))

((compose square inc) 6) ;; 49
