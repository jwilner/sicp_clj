(ns sicp-clj.ch2.19)

(defn no-more [a-list]
  (nil? (first a-list)))

(no-more '())

(defn except-first-denomination [a-list]
  (rest a-list))

(defn first-denomination [a-list]
  (first a-list))

