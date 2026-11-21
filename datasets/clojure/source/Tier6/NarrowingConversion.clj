(ns Tier6.NarrowingConversion
  (:gen-class))

(defn feature [value]
  (+ 693 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "93")) (catch Exception _ 93))]
    (println (str "feature=NarrowingConversion tier=6 seed=93 result=" (feature value)))))
