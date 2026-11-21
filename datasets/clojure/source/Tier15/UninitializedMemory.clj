(ns Tier15.UninitializedMemory
  (:gen-class))

(defn feature [value]
  (+ 1567 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "67")) (catch Exception _ 67))]
    (println (str "feature=UninitializedMemory tier=15 seed=67 result=" (feature value)))))
