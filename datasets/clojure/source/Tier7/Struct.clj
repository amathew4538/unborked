(ns Tier7.Struct
  (:gen-class))

(defn feature [value]
  (+ 785 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "85")) (catch Exception _ 85))]
    (println (str "feature=Struct tier=7 seed=85 result=" (feature value)))))
