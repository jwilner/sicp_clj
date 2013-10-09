(ns sicp-clj.exc_1_17 )

(defn dubble [n] (+ n n))
(defn halve [n] (/ n 2))

(defn fast-mult [a b]
  (do
    (println a b)
      (cond 
       (= 0 b) 0
       (even? b) (dubble (fast-mult a (halve b)))
       :else (+ a (fast-mult a (dec b))))))

(fast-mult 3 83)
(fast-mult 7 10)

