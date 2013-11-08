(ns sicp-clj.ch1.34 )

(defn f [g]
  (g 2))

(f #(* % %));; 4

(f #(* % (+ % 1)));; 6

(f f) ;; Can't use integer as function, duh 

;; This is because (f f) expands to (f (f 2)) which in turn expands to 
;; (f (f (2 2))) -- but (2 2) isn't callable. 
