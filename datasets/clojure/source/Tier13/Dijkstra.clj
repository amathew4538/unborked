(ns Tier13.Dijkstra
  (:gen-class))

(defn feature [value]
  (+ 1386 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "86")) (catch Exception _ 86))]
    (println (str "feature=Dijkstra tier=13 seed=86 result=" (feature value)))))
