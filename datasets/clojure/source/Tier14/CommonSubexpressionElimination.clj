(ns Tier14.CommonSubexpressionElimination
  (:gen-class))

(defn feature [value]
  (+ 1452 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "52")) (catch Exception _ 52))]
    (println (str "feature=CommonSubexpressionElimination tier=14 seed=52 result=" (feature value)))))
