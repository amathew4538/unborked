(ns Tier14.RegisterSpilling
  (:gen-class))

(defn feature [value]
  (+ 1437 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "37")) (catch Exception _ 37))]
    (println (str "feature=RegisterSpilling tier=14 seed=37 result=" (feature value)))))
