(ns Tier14.ConstantPropagation
  (:gen-class))

(defn feature [value]
  (+ 1475 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "75")) (catch Exception _ 75))]
    (println (str "feature=ConstantPropagation tier=14 seed=75 result=" (feature value)))))
