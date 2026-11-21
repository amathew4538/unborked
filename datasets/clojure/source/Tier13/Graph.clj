(ns Tier13.Graph
  (:gen-class))

(defn feature [value]
  (+ 1306 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "6")) (catch Exception _ 6))]
    (println (str "feature=Graph tier=13 seed=6 result=" (feature value)))))
