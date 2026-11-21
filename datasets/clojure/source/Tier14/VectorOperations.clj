(ns Tier14.VectorOperations
  (:gen-class))

(defn feature [value]
  (+ 1407 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "7")) (catch Exception _ 7))]
    (println (str "feature=VectorOperations tier=14 seed=7 result=" (feature value)))))
