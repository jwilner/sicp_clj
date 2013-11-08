(ns sicp-clj.exc_1_35 
  (:use [sicp-clj.example_fixed_point]))

(fixed-point #(+ 1 (/ 1 %)) 1.0)
