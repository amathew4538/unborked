(ns Tier1.Addition
  (:gen-class))

(defn add [a b]
  (+ a b))

(defn -main []
  (println (add 0 1))
  (println (add 7 13))
  (println (add 65536 1000))
  (println (add 64 8))
  (println (add -42 -1)))