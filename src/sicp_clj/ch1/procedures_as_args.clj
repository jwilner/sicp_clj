(ns sicp-clj.ch1.procedures_as_args )

(defn my-sum
  "Higher order suming of a series"
  [term a my-next b]
  (if (> a b)
    0
    (+ (term a)
       (my-sum term (my-next a) my-next b))))

(defn cube [a]
  (* a a a))

(defn clj-sum
  "More idiomatic clojure version?"
  [term a my-next b]
  (loop [n a
         acc 0]
    (if (> n b)
      acc
      (recur (my-next n) (+ acc (term n))))))

(defn integral [f a b dx]
  (let [add-dx #(+ % dx)]
    (* (clj-sum f (+ a (/ dx 2.0)) add-dx b)
       dx)))


