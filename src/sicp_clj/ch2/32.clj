(ns sicp-clj.ch2.32
  (:use [sicp-clj.ch2.append :only [append]]))

(defn subsets [s]
  (if (nil? s) 
    '()
    (let [remaining (subsets (next s))]
      (append remaining 
              (map #(cons (first s) 
                          %)
                   remaining)))))

(subsets '(1 2 3))
