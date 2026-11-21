(ns Tier13.Serialization
  (:gen-class))

(defn feature [value]
  (+ 1344 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "44")) (catch Exception _ 44))]
    (println (str "feature=Serialization tier=13 seed=44 result=" (feature value)))))
