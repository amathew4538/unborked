(ns Tier8.Lambda
  (:gen-class))

(defn feature [value]
  (+ 834 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "34")) (catch Exception _ 34))]
    (println (str "feature=Lambda tier=8 seed=34 result=" (feature value)))))
