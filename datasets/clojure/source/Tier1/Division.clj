(ns Tier1.Division
  (:gen-class))

(defn divide [a b]
  (/ a b))

(defn -main []
  (println (divide 0 1))
  (println (divide 7 13))
  (println (divide 65536 1000))
  (println (divide 64 8))
  (println (divide -42 -1)))
