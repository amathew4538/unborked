(ns Tier14.StrengthReduction
  (:gen-class))

(defn feature [value]
  (+ 1458 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "58")) (catch Exception _ 58))]
    (println (str "feature=StrengthReduction tier=14 seed=58 result=" (feature value)))))
