(ns sicp-clj.ch1.28 
  (:use [sicp-clj.ch1.27 :only [poss-cars]]
        [sicp-clj.ch1.3 :only [square]]))

(defn trivial-test 
  [a n]
   (if (and  (not (= a 1)) 
             (not (= a (dec n))) 
             (= (mod (square a) n) 1))
        0
        a))


(defn miller-rabin-expmod
  "Modified version of expmod checking if it has discovered a 
  non trivial root of 1"
  [base exp m]
  (cond (zero? exp) 1
        (even? exp) (trivial-test
                       (mod
                        (square 
                          (miller-rabin-expmod
                            base
                            (/ exp 2)
                            m))
                         m)
                      m)
        :else       (mod
                        (* base 
                           (miller-rabin-expmod base (dec exp) m))
                      m)))

(defn miller-rabin-test
  "Test primality of n by picking a random number a < n and raising 
  it to the (n-1st) power modulo n using the expmod procedure."
  ([n limit]
    (let [a (dec n)]
      (loop [counter 0]
        (cond 
          (= counter limit) true
          (zero? (miller-rabin-expmod (inc (rand-int (dec n))) a n)) false
          :else (recur (inc counter)))
      ))))

(doseq [a (range 100 120)]
  (println a 
  (miller-rabin-test a 5)))
