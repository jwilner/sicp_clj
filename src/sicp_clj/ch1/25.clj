(ns sicp-clj.ch1.25)

(mod (fast-expt 1 4 5) 3)
(mod (fast-expt 4 4 4) 3)
(mod (fast-expt 4 16 2) 3)
(mod (fast-expt 4 256 1) 3)
(mod (fast-expt 1024 256 0) 3)
(mod 1024 3)

(expmod 4 5 3)
(mod (* 4 (expmod 4 4 3)) 3)
(mod (* 4 (mod (square (expmod 4 2 3)) 3))3)
(mod (* 4 (mod (square (mod (square (expmod 4 1 3)) 3)) 3)) 3)
(mod (* 4 (mod (square (mod (square (mod (* 4 (expmod 4 0 3)) 3)) 3)) 3)) 3)
(mod (* 4 (mod (square (mod (square (mod (* 4 1) 3)) 3)) 3)) 3)
(mod (* 4 (mod (square (mod (square (mod 4 3)) 3)))))
(mod (* 4 (mod (square (mod (square 1) 3)))))
(mod (* 4 (mod (square (mod 1 3)) 3)) 3)
(mod (* 4 (mod (square 1) 3)) 3)
(mod (* 4 (mod 1 3)) 3)
(mod (* 4 1) 3)
(mod 4 3)
1

;; But actually the problem is that fast-expt can potentially attempt
;; to raise a number to the millionth power, which is problematic.
