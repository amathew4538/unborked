(ns Tier6.FloatingPointSpecialValues
  (:gen-class))

(defn feature [value]
  (+ 630 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "30")) (catch Exception _ 30))]
    (println (str "feature=FloatingPointSpecialValues tier=6 seed=30 result=" (feature value)))))
