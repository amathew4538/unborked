(ns Tier6.NumericPromotion
  (:gen-class))

(defn feature [value]
  (+ 696 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "96")) (catch Exception _ 96))]
    (println (str "feature=NumericPromotion tier=6 seed=96 result=" (feature value)))))
