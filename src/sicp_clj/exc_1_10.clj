(ns sicp-clj.exc_1_10 )


(defn A [x y]
  (cond (= y 0) 0
        (= x 0) (* 2 y)
        (= y 1) 2
        :else (A (- x 1)
                     (A x (- y 1)))))

(A 1 10)
(A 0 (A 1 9))
(A 0 (A 0 (A 1 8)))
;;...
(A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 1))))))))))
(A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 2)))))))))
(A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (* 2 2)))))))))
(A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (A 0 (* 2 4))))))))
;;... 1024

(A 2 4)
(A 1 (A 2 3))
(A 1 (A 1 (A 2 2)))
(A 1 (A 1 (A 1 (A 2 1))))
(A 1 (A 1 (A 1 2)))
(A 1 (A 1 (A 0 (A 1 1))))
(A 1 (A 1 (A 0 2)))
(A 1 (A 1 4))
(A 1 (A 0 (A 1 3)))
;; ... 65536

(A 3 3)
;; ... 65536

(defn f [n] (A 0 n))
;; (fn [n] (* 2 n))

(defn g [n] (A 1 n))
;;((fn [n] (reduce * (repeat n 2))) 10)

(defn h [n] (A 2 n))
;; Tetration? i.e. 2 to the n where to the n is repeated n-1 times?


