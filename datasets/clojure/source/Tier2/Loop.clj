(ns Tier2.Loop (:gen-class))
(defn -main [] (println (reduce + (range 1 6))))
