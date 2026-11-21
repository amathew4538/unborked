(ns Tier7.MultidimensionalArray
  (:gen-class))

(defn feature [value]
  (+ 785 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "85")) (catch Exception _ 85))]
    (println (str "feature=MultidimensionalArray tier=7 seed=85 result=" (feature value)))))
