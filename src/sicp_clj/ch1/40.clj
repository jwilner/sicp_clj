(ns sicp-clj.ch1.40
  (:use [sicp-clj.ch1.3 :only [square]]
        [sicp-clj.ch1.newtons_method :only [newtons-method cube]]))

(defn cubic [a b c]
  #(+ (cube %) (* a (square %)) (* b %) c))

(newtons-method (cubic 1 3 5) 1) ;; ~ -1.4

((cubic 1 3 5) -1.4) ;; ~ 0. Noice.

