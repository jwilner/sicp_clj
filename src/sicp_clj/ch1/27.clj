(ns sicp-clj.ch1.27 
  (:use [sicp-clj.ch1.fermat_test :only [expmod]]
        [sicp-clj.ch1.21 :only [smallest-divisor]]))

(def poss-cars '(561 1105 1729 2465 2821 6601))

(defn altered-fermat-test
  [n]
  (map #(= % (expmod %  n n)) (range n)))

(defn carmichael?
  [n]
  (if (every? true? (altered-fermat-test n))
    (not (= n (smallest-divisor n))) ;; if fermat says prime, check if really
    false))

(map carmichael? poss-cars)

(empty? (filter #(not= % (expmod % n n)) 
                (range n)))
