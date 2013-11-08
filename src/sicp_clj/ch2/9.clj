(ns sicp-clj.ch2.9 
  (:use [sicp-clj.ch2.8 :only [upper-bound lower-bound]]))

(defn interval-width [a]
  (/ (- upper-bound
        lower-bound) 
     2))

