(ns Tier12.ProcessSpawn
  (:gen-class))

(defn feature [value]
  (+ 1263 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "63")) (catch Exception _ 63))]
    (println (str "feature=ProcessSpawn tier=12 seed=63 result=" (feature value)))))
