(ns sicp-clj.ch1.cnting_change )

(defn first-denomination [kinds-of-coins]
  (cond 
      (= kinds-of-coins 1) 1
      (= kinds-of-coins 2) 5
      (= kinds-of-coins 3) 10
      (= kinds-of-coins 4) 25
      (= kinds-of-coins 5) 50))

(defn cc [amount kinds-of-coins]
  (cond 
    (= amount 0) 1
    (or (< amount 0) (= kinds-of-coins 0)) 0
    :else (+ (cc 
               amount 
               (dec kinds-of-coins))
             (cc
               (- amount (first-denomination kinds-of-coins))
               kinds-of-coins))))

(defn count-change [amount]
  (cc amount 5))

(count-change 100)

