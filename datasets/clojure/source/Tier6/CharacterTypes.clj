(ns Tier6.CharacterTypes
  (:gen-class))

(defn feature [value]
  (+ 630 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "30")) (catch Exception _ 30))]
    (println (str "feature=CharacterTypes tier=6 seed=30 result=" (feature value)))))
