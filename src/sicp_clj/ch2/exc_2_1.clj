(ns sicp-clj.exc_2_1 
  (:import (java.lang.Math)))

(defn make-rat [n d]
  (if (neg? (* n d))
    (list n d)
    (list (Math/abs n) (Math/abs d))))

(make-rat 3 -4)
