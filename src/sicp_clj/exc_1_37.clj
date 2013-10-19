(ns sicp-clj.exc_1_37)

(defn always-one [x] 1)

(defn rec-cont-frac [n d k i]
  (if (> i k)
     0.0
     (/ (n i) (+ (d i) (rec-cont-frac n d k (inc i))))))

(rec-cont-frac always-one always-one 15 0)

(defn cont-frac [n d k]
  (loop [i k
         acc 0.0]
    (if (zero? i)
      acc
      (recur (dec i) (/ (n i) (+ acc (d i)))))))

(cont-frac always-one always-one 11)
