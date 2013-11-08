(ns sicp-clj.ch1.22
  (:use [sicp-clj.ch1.21 :only [smallest-divisor]]
        [sicp-clj.ch1.16 :only [fast-expt]]))

(defn naive-prime?
  "Naive implementation of priming process"
  [n]
  (= n (smallest-divisor n)))

(defn test-prime-function
  "Pass a function and a prime to print the function's processing time and 
  return its result."
  [func n]
  (time (func n)))

(defn search-for-primes
  "Search the designated range for primes in the given range with the given
  function, printing results"
  ([n num-to-find func] (search-for-primes n num-to-find func 0))
  ([n num-to-find func counter]
  (if (= num-to-find counter) 
    (prn "Done")
    (do
        (pr (str n))
        (if (time (func n))
          (do
            (prn "Prime") 
            (recur (inc n) num-to-find func (inc counter)))
          (do
            (prn "No") 
            (recur (inc n) num-to-find func counter)))))))

(defn prime-search-wrap [prime-test]
  (doseq [a (range 3 7)]
    (search-for-primes (fast-expt 10 a) 3 prime-test)))

(defn -main [] (prime-search-wrap naive-prime?))

(defn alt-search
  [n num-to-find func]
  (loop [m n 
         counter 0]
    (if (= num-to-find counter)
      (prn "Done")
      (do 
          (pr (str m))
        (if (time (func m))
         (do
          (prn "Prime")
          (recur (inc m) (inc counter)))
         (do
          (prn "No")
          (recur (inc m) counter)))))))

(alt-search (fast-expt 10 6) 3 naive-prime?) 
