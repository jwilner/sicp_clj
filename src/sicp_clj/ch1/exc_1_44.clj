(ns sicp-clj.exc_1_44
  (:use [sicp-clj.exc_1_43 :only [repeated]]
        [sicp-clj.example_newtons_method :only [dx]]))

(defn smooth [f]
  #(/ (+ (f %) (f (- % dx)) (f (+ % dx)))
      3)) 

(defn n-fold-smooth [f n]
  (repeated f n))


