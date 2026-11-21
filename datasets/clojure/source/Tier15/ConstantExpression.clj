(ns Tier15.ConstantExpression
  (:gen-class))

(defn feature [value]
  (+ 1528 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "28")) (catch Exception _ 28))]
    (println (str "feature=ConstantExpression tier=15 seed=28 result=" (feature value)))))
