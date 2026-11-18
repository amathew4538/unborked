(ns Tier3.Sorting
  (:gen-class))

(defn -main []
  (println (clojure.string/join " " (sort [42 7 13 2 64 1])))
)
