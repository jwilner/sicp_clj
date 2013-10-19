(ns sicp-clj.exc_1_46 )

(defn iterative-improve
  [good-enuf? impruv]
  (fn [guess]
    (if (good-enuf? guess)
     guess
     (recur (impruv guess))))) 


