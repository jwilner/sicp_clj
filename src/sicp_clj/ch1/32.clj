(ns sicp-clj.exc_1_32 )


(defn accumulate 
  [combiner null-value term a my-next b]
  (if (> a b)
    null-value
    (combiner (term a) (accumulate combiner null-value term (my-next a) my-next b))))

(defn acc-iter
  [combiner null-value term a my-next b]
  (loop [acc null-value
         n a]
    (if (> n b)
      acc
      (recur (combiner acc n) (my-next n)))))

(accumulate + 0 identity 1 inc 10)
(acc-iter + 0 identity 1 inc 10)
