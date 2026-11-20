(ns Tier1.Power
  (:gen-class))

(defn power [a b]
  (Math/pow a b))

(defn -main []
  (println (power 0 1))
  (println (power 7 13))
  (println (power 65536 1000))
  (println (power 64 8))
  (println (power -42 -1)))
