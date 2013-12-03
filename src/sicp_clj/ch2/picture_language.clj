(ns sicp-clj.ch2.picture-language)

(def wave2 (beside wave (flip-vert wave)))

(defn flipped-pairs [painter]
  (let [painter2 (besides painter (flip-vert painter))]
    (below painter2 painter2)))

(def wave4 (flipped-pairs wave))

(defn right-split [painter n]
  (if (zero? n)
    painter
    (let [smaller (right-split painter (dec n))]
      (beside painter (below smaller smaller)))))

(defn corner-split [painter n]
  (if (zero? n)
    painter
    (let [up (up-split painter (dec n))
          right (right-split painter (dec n))
          top-left (beside up up)
          bottom-right (below right right)
          corner (corner-split painter (dec n))]
      (beside (below painter top-left)
              (below bottom-right corner)))))
