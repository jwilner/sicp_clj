(ns sicp-clj.ch2.36
  (:use [sicp-clj.ch2.my-pretend-HOF :only [accumulate]]))

(defn accumulate-n
  [op init seqs]
  (if (empty? seqs)
    nil
    (cons (accumulate op 
                      init 
                      (map first 
                           seqs))
          (accumulate-n op 
                        init 
                        (remove empty?
                                (map rest 
                                     seqs))))))

(def a-n-seq '((1 2 3)
               (4 5 6)
               (7 8 9)
               (10 11 12)))

(accumulate + 0 '(1 4 7 10))

(accumulate-n + 0 a-n-seq)
;; '(22 26 30)
