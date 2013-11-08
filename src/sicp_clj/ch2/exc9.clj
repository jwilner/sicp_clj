(ns sicp-clj.ch2.exc9 
  (:use [sicp-clj.ch2.exc8 :only [upper-bound lower-bound]]))

(defn interval-width [a]
  (/ (- upper-bound
        lower-bound) 
     2))

