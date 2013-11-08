(ns sicp-clj.ch1.9)

;; Exercise 1.9

(defn new-+ [a b]
  (if (= a 0)
    b
    (inc (new-+ (dec a) b))))

(new-+ 4 5)
;;
;; Expands as follows:
;; (new-+ 4 5)
;; (inc (new-+ 3 5))
;; (inc (inc (new-+ 2 5)))
;; (inc (inc (inc (new-+ 1 5))))
;; (inc (inc (inc (inc (new-+ 0 5)))))
;; (inc (inc (inc (inc 5)
;; (inc (inc (inc 6)
;; (inc (inc 7)
;; (inc 8)
;; 9
(defn newer-+ [a b]
  (if (= a 0)
   b
   (recur (dec a) (inc b))))

(newer-+ 4 5)
;; Notably, the fact Clojure lets you use 'recur' in this context is a sign
;; that the function is indeed tail-recursive.
;; (newer-+ 4 5)
;; (newer-+ 3 6)
;; (newer-+ 2 7)
;; (newer-+ 1 8)
;; (newer-+ 0 9)
;; 9


