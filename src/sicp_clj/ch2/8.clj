(ns sicp-clj.ch2.8
  (:use [sicp-clj.ch2.7 [make-interval lower-bound upper-bound]]))

(defn sub-interval [a b]
  (let [lower-order (make-interval (lower-bound a) (lower-bound b))
        higher-order (make-interval (upper-bound a) (upper-bound b))]
    (make-interval (- (upper-bound lower-order) (lower-bound lower-order))
                   (- (upper-bound higher-order) (lower-bound higher-order)))))


