(ns Tier8.Exception
  (:gen-class))

(defn feature [value]
  (+ 829 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "29")) (catch Exception _ 29))]
    (println (str "feature=Exception tier=8 seed=29 result=" (feature value)))))
