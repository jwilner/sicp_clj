(ns sicp-clj.ch2.20)

(defn same-parity [n & others]
  (let [n-odd (odd? n)
        matches #(= n-odd (odd? %))]
    (loop [return (list n)
           remaining others]
      (if (empty? remaining)
        return
        (let [this (first remaining)]
          (recur (if (matches this)
                     (cons this return)   
                     return)
                 (rest remaining)))))))
                  
(same-parity 1 3 4 5 6)
