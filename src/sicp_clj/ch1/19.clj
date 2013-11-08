(ns sicp-clj.ch1.19 
  (:use [sicp-clj.ch1.3 :only [square]]))

(defn fib 
  "Calculates a fib number in log n time thanks to some obscure math stuff"
  ([n] (fib 1 0 0 1 n))
  ([a b p q n]
      (cond (zero? n) b
            (even? n) (recur a 
                             b
                             (+ (square p) (square q));;Calculate p 
                             (+ (* 2 q p) (square q));;Calculate q 
                             (/ n 2 ))
            :else     (recur (+ (* b q) (* a q) (* a p))
                             (+ (* b p) (* a q))
                             p
                             q
                             (dec n)))))

(fib 2)

;; Tpq(Tpq(a,b)) = 
;; (bq + aq)*q + (bq + aq + ap)*q + (bq + aq + ap)*p, (bq + aq)*p + (bq + aq + ap)*q =
;;
