(ns sicp-clj.ch1.39
  (:use [sicp-clj.ch1.37 :only [cont-frac]]
        [sicp-clj.ch1.3 :only [square]]))

(defn tan-cf [x k]
  (let [sqed (square x)]
    (loop [i k
           acc 0.0]
      (if (zero? i)
          (/ x (- 1 acc))
          (recur (dec i) (/ sqed (inc (* 2 i))))))))

(tan-cf 0.5 100)
