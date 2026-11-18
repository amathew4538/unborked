(ns Tier2.Array
  (:gen-class))
(defn -main []
  (let [values [2 4 6 8 10]]
   (doseq [value values] (println value))
   (println (reduce + values))))
