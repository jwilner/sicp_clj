(ns sicp-clj.ch1.31 )

(defn product-iter [func a my-next b]
  (loop [n a
         acc 0]
    (if (> n b)
      acc
      (recur (my-next a) (* acc (func a))))))

(defn approx-pi

