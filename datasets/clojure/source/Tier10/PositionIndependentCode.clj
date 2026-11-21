(ns Tier10.PositionIndependentCode
  (:gen-class))

(defn feature [value]
  (+ 1088 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "88")) (catch Exception _ 88))]
    (println (str "feature=PositionIndependentCode tier=10 seed=88 result=" (feature value)))))
