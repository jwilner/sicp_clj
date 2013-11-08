(ns sicp-clj.exc_1_41)

(defn double-apply [f]
  #(f (f %)))

(((double-apply (double-apply double-apply)) inc) 5) ;; 21

