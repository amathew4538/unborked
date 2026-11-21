(ns Tier8.VariadicFunction
  (:gen-class))

(defn feature [value]
  (+ 893 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "93")) (catch Exception _ 93))]
    (println (str "feature=VariadicFunction tier=8 seed=93 result=" (feature value)))))
