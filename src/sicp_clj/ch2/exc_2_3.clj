(ns sicp-clj.exc_2_3
  (:use [sicp-clj.exc_2_2])
  (import java.lang.Math))

(defn make-rect [a b c d]
  (list a b c d))

(defn rect-side [rect x]
  (nth rect x))

(defn line-length [seg]
  (let [a (start-segment seg)
        b (end-segment seg)]
    (Math/sqrt (+ (square (- (x-point a) (x-point b)))
                  (square (- (y-point a) (y-point b)))))))

(defn rect-area [rect]
  (* (line-length (rect-side rect 0))
     (line-length (rect-side rect 1))))

(defn rect-perimeter [rect]
  (* 2
     (+ (line-length (rect-side rect 0))
        (line-length (rect-side rect 1)))))
