(ns sicp-clj.ch1.15 
  (:use [sicp-clj.ch1.5 :only [abs]]))

(defn cube [x]
  (* x x x))

(defn p [x]
  (- (* 3 x)
     (* 4 (cube x))))

(defn sine [a]
  (if (not (> (abs a) 0.1))
    a
    (p (sine (/ a 3.0)))))

(sine 12.15)


