(ns sicp-clj.exc_1_19 
  (:use [sicp-clj.exc_1_3 :only [square]]))

(defn fib 
  "Calculates a fib number in log n time thanks to some obscure math stuff"
  [n]
  (defn fib-iter [a b p q le_count]
      (cond (zero? le_count) b
            (even? le_count) (recur a 
                                    b 
                                    (+ (square p) (square q));;Calculate p 
                                    (+ (* 2 q p) (square q));;Calculate q 
                                    (/ le_count 2 ))
            :else            (recur (+ (* b q) (* a q) (* a p))
                                    (+ (* b p) (* a q))
                                    p
                                    q
                                    (dec le_count))))
   (fib-iter 1 0 0 1 n))

(fib 91)

;; Tpq(Tpq(a,b)) = 
;; (bq + aq)*q + (bq + aq + ap)*q + (bq + aq + ap)*p, (bq + aq)*p + (bq + aq + ap)*q =
;; (2q**2 + 2qp + p**2)*a, (p**2 + q**2)*b
;;
