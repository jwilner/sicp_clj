(ns sicp-clj.ch2.exc10 )

(defn div-interval [x y]
  (let [zero-or-error #(if (zero? %)
                         (Exception.)
                         %)]
    (mul-interval x
                  (make-interval (/ 1.0 (zero-or-error (lower-bound y)))
                                 (/ 1.0 (zero-or-error (upper-bound y)))))))

