(ns Tier15.VariableShadowing
  (:gen-class))

(defn feature [value]
  (+ 1520 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "20")) (catch Exception _ 20))]
    (println (str "feature=VariableShadowing tier=15 seed=20 result=" (feature value)))))
