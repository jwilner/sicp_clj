(ns sicp-clj.ch1.33 
  (:use [sicp-clj.ch1.22 :only [naive-prime?]]
        [sicp-clj.ch1.20 :only [euclid-gcd]]))

(defn acc-filter 
  [combiner my-filter null-value term a my-next b]
  (loop [acc null-value
        n a]
    (if (> n b) acc
          (recur 
            (if (my-filter n)
              (combiner acc (term n))
              acc)
            (my-next n)))))
         

(acc-filter + fast-prime-fermat 0 #(* % %) 0  inc 20)
(reduce + (map #(* % %) '(2 3 5 7 11 13 17 19)))

(+ 5 7 11 13 17 19)

(defn product-coprimes-less-than [n]
  (acc-filter * #(= 1 (euclid-gcd % n)) 1 identity 1 inc n))

(product-coprimes-less-than 10)


(defn some-func [a b c]
  (+ a b c))

(def partial-f (partial some-func 1))
(def closure-1 #(some-func 1 %1 %2))
(def closure-2 #(some-func %1 1 %2))

(partial-f 2 3)
(closure-1 2 3)
(closure-1 2 3 4 5 6)
(partial-f 2 3 4 5 6)
