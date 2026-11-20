(ns Tier1.Modulus
  (:gen-class))

(defn modulo [a b]
  (mod a b))

(defn -main []
  (println (modulo 0 1))
  (println (modulo 7 13))
  (println (modulo 65536 1000))
  (println (modulo 64 8))
  (println (modulo -42 -1)))
