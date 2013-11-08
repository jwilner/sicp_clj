(ns sicp-clj.exc_1_37)

(defn always-one [x] 1.0)

(defn rec-cont-frac [n d k i]
  (if (> i k)
     0.0
     (/ (n i) (+ (d i) (rec-cont-frac n d k (inc i))))))

(rec-cont-frac always-one always-one 15 0)

(defn cont-frac [n d k]
  (loop [i k
         acc 1.0]
    (if (zero? i)
        acc
        (recur (dec i) (/ (n i) (+ acc (d i)))))))

(defn cont-frac-iter [n d k]
  (do
    (defn cont-frac-inner [i acc]
      (if (zero? i)
        acc
        (recur (dec i) (/ (n i) (+ acc (d i))))))
    (cont-frac-inner k 0.0)))


(cont-frac always-one always-one 10)
(rec-cont-frac always-one always-one 11 0)
