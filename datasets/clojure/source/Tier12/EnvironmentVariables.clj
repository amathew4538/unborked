(ns Tier12.EnvironmentVariables
  (:gen-class))

(defn feature [value]
  (+ 1252 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "52")) (catch Exception _ 52))]
    (println (str "feature=EnvironmentVariables tier=12 seed=52 result=" (feature value)))))
