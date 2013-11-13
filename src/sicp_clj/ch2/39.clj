(ns sicp-clj.ch2.39
  (:use [sicp-clj.ch2.38 :only [fold-left]]
        [sicp-clj.ch2.my-pretend-HOF :rename {accumulate fold-right}]
        [sicp-clj.ch2.append :only [append]]))

(def test-seq '(3 2 1))

(defn right-reverse
  [a-seq]
  (fold-right #(append %2 
                       (list %1))
              nil 
              a-seq))

(defn left-reverse
  [a-seq]
  (fold-left #(cons %2 
                    %1) 
             () 
             a-seq))

(left-reverse test-seq)
(right-reverse test-seq)
