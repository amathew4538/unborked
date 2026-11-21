(ns Tier9.ObjectConstruction
  (:gen-class))

(defn feature [value]
  (+ 993 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "93")) (catch Exception _ 93))]
    (println (str "feature=ObjectConstruction tier=9 seed=93 result=" (feature value)))))
