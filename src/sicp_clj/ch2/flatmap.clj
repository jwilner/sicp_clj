(ns sicp-clj.ch2.flatmap 
  (:use [sicp-clj.ch2.my-pretend-HOF :only [accumulate]]
        [sicp-clj.ch2.append :only [append]]))

(defn flatmap [proc a-seq]
  (accumulate append () (map proc 
                             a-seq)))
