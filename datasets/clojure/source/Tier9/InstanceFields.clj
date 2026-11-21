(ns Tier9.InstanceFields
  (:gen-class))

(defn feature [value]
  (+ 975 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "75")) (catch Exception _ 75))]
    (println (str "feature=InstanceFields tier=9 seed=75 result=" (feature value)))))
