(ns sicp-clj.ch1.11)

(defn f [n]
  (if (< n 3)
    n
   (+ (f (dec n))
      (* 2 (f (- n 2)))
      (* 3 (f (- n 3)))))) 

(f 3);4
(f 4);11
(f 5);25
(f 6);59 
(f 7);142

(defn f-wrap [n]
    (defn f-iter [cnt acc f1 f2 f3]
      (if (= cnt n)
        acc
        (recur (inc cnt)
               (+ acc
                (* 2 f1)
                (* 3 f2))
          acc
          f1
          f2)))
    (if (< n 3)
       n
      (f-iter 3 4 2 1 0)))

(f-wrap 4)
(f-wrap 6)
