(ns sicp-clj.ch2.37
  (:use [sicp-clj.ch2.my-pretend-HOF :only [accumulate]]
        [sicp-clj.ch2.36 :only [accumulate-n]]))

(def a-matrix '((1 2 3 4)
                (4 5 6 6)
                (6 7 8 9)))

(defn dot-product
  [v w]
  (accumulate +
              0
              (map * v w)))

(defn matrix-*-vector
  [m v]
  (map (partial dot-product 
                v)
       m))

(defn transpose
  [m]
  (accumulate-n cons
                nil
                m))

(defn matrix-*-matrix
  [m n]
  (let [cols (transpose n)]
    (map (partial matrix-*-vector 
                  cols) 
         m)))

(matrix-*-matrix (map (partial take 3)
                      a-matrix)
                 (map (partial take 3)
                      a-matrix))
