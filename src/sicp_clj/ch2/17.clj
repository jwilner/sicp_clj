(ns sicp-clj.ch2.17 )

(defn last-pair [a-list]
  (loop [remaining a-list]
    (let [next-list (rest remaining)]
      (if (empty? next-list)
        remaining
        (recur next-list)))))

(rest '())

(last-pair '(1 2 3 4 5)) 
