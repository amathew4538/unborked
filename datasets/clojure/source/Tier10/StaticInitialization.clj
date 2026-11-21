(ns Tier10.StaticInitialization
  (:gen-class))

(defn feature [value]
  (+ 1024 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "24")) (catch Exception _ 24))]
    (println (str "feature=StaticInitialization tier=10 seed=24 result=" (feature value)))))
