(ns Tier6.IntegerOverflow
  (:gen-class))

(defn feature [value]
  (+ 685 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "85")) (catch Exception _ 85))]
    (println (str "feature=IntegerOverflow tier=6 seed=85 result=" (feature value)))))
