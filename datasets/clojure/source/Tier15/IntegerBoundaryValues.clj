(ns Tier15.IntegerBoundaryValues
  (:gen-class))

(defn feature [value]
  (+ 1523 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "23")) (catch Exception _ 23))]
    (println (str "feature=IntegerBoundaryValues tier=15 seed=23 result=" (feature value)))))
