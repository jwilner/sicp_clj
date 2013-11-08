(ns sicp-clj.ch1.35 
  (:use [sicp-clj.ch1.fixed_point]))

(fixed-point #(+ 1 (/ 1 %)) 1.0)
