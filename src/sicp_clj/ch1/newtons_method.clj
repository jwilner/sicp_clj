(ns sicp-clj.example_newtons_method 
  (:use [sicp-clj.example_fixed_point :only [fixed-point]]
        [sicp-clj.exc_1_3 :only [square]]))

(def dx 0.00001)

(defn deriv [g]
  #(/ (- (g (+ % dx)) (g %))
      dx))

(defn cube [x]
  (* x x x))

((deriv cube) 5)

(defn newton-transform [g]
  #(- % (/ (g %) ((deriv g) %))))

(defn newtons-method [g guess]
  (fixed-point (newton-transform g) guess))

(defn newton-sqrt [x]
  (newtons-method #(- (square %) x) 1.0))

(newton-sqrt 144)
