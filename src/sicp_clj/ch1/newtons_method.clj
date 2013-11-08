(ns sicp-clj.ch1.newtons_method 
  (:use [sicp-clj.ch1.fixed_point :only [fixed-point]]
        [sicp-clj.ch1.3 :only [square]]))

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
