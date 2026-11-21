(ns Tier9.StaticMethods
  (:gen-class))

(defn feature [value]
  (+ 930 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "30")) (catch Exception _ 30))]
    (println (str "feature=StaticMethods tier=9 seed=30 result=" (feature value)))))
