(ns Tier6.ImplicitConversion
  (:gen-class))

(defn feature [value]
  (+ 628 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "28")) (catch Exception _ 28))]
    (println (str "feature=ImplicitConversion tier=6 seed=28 result=" (feature value)))))
