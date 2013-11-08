(ns sicp-clj.ch2.29)

(defn make-mobile [left right]
  (list left right))

(defn left-branch [mobile]
  (first mobile))

(defn right-branch [mobile]
  (first (next mobile)))

(defn make-branch [length structure]
  (list length structure))

(defn branch-length [branch]
  (first branch))

(defn branch-structure [branch]
  (first (next branch)))

(defn total-weight [structure]
  (if-not (list? structure) ;; not mobile
    structure
    (+ (total-weight (branch-structure (left-branch structure)))
       (total-weight (branch-structure (right-branch structure)))))) 

(def total-torque [structure]
  (if-not (list? structure)
    structure
    (let [lb (left-branch structure)
          rb (right-branch structure)]
      (+ (* (branch-length lb) 
            (total-torque (branch-structure lb)))
         (* (branch-length rb)
            (total-torque (branch-structure rb)))))))

(defn is-balanced? [structure]
  (if-not (list? structure)
    true
    (let [lb (left-branch structure)
          rb (right-branch structure)
          ls (branch-structure lb)
          rs (branch-structure rb)]
      (and (= (* (branch-length lb) (total-weight ls))
              (* (branch-length rb) (total-weight rs)))
           (is-balanced? ls)
           (is-balanced? rs)))))
