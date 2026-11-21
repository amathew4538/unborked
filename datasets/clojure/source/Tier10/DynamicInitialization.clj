(ns Tier10.DynamicInitialization
  (:gen-class))

(defn feature [value]
  (+ 1077 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "77")) (catch Exception _ 77))]
    (println (str "feature=DynamicInitialization tier=10 seed=77 result=" (feature value)))))
