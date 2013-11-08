(ns sicp-clj.ch1.44
  (:use [sicp-clj.ch1.43 :only [repeated]]
        [sicp-clj.ch1.newtons_method :only [dx]]))

(defn smooth [f]
  #(/ (+ (f %) (f (- % dx)) (f (+ % dx)))
      3)) 

(defn n-fold-smooth [f n]
  (repeated f n))


