(ns sicp-clj.ch2.41
  (:use [sicp-clj.ch2.flatmap :only [flatmap]]
        [sicp-clj.ch2.append :only [append]]
        [sicp-clj.ch2.40 :only [unique-pairs]])) 

(defn unique-triples [n]
  (flatmap (fn [i]
             (map #(cons i %)
                  (unique-pairs i)))      
           (range 3 n)))

(unique-triples 5)

(defn unique-tuples [n index]
  (cond (not (pos? index)) ()
        (= 1 index) (map list (range 1 n))
        :else (let [dec-n (dec n)
                    next-level (dec index)]
                  (flatmap (fn [i]
                            (map #(cons i %)
                                 (unique-tuples i next-level)))
               (range index n)))))

(count (unique-tuples 10 10))
