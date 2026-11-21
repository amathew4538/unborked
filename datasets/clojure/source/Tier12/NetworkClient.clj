(ns Tier12.NetworkClient
  (:gen-class))

(defn feature [value]
  (+ 1283 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "83")) (catch Exception _ 83))]
    (println (str "feature=NetworkClient tier=12 seed=83 result=" (feature value)))))
