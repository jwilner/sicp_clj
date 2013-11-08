(ns sicp-clj.ch2.23 )

;; (for-each #(println x) '(57 321 88))
;; 57
;; 321
;; 88

(defn for-each [func args]
  (if-not (empty? args)
    (do
      (func (first args))
      (recur func (rest args)))))

      
(for-each println '(57 321 88))

