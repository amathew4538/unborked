(ns Tier9.Reflection
  (:gen-class))

(defn feature [value]
  (+ 952 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "52")) (catch Exception _ 52))]
    (println (str "feature=Reflection tier=9 seed=52 result=" (feature value)))))
