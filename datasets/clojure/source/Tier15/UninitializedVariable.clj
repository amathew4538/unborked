(ns Tier15.UninitializedVariable
  (:gen-class))

(defn feature [value]
  (+ 1560 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "60")) (catch Exception _ 60))]
    (println (str "feature=UninitializedVariable tier=15 seed=60 result=" (feature value)))))
