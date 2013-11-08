(ns sicp-clj.exc_1_40
  (:use [sicp-clj.exc_1_3 :only [square]]
        [sicp-clj.example_newtons_method :only [newtons-method cube]]))

(defn cubic [a b c]
  #(+ (cube %) (* a (square %)) (* b %) c))

(newtons-method (cubic 1 3 5) 1) ;; ~ -1.4

((cubic 1 3 5) -1.4) ;; ~ 0. Noice.

