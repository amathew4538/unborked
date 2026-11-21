(ns Tier11.AsyncAwait
  (:gen-class))

(defn feature [value]
  (+ 1171 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "71")) (catch Exception _ 71))]
    (println (str "feature=AsyncAwait tier=11 seed=71 result=" (feature value)))))
