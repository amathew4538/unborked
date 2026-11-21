(ns Tier12.FileMetadata
  (:gen-class))

(defn feature [value]
  (+ 1240 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "40")) (catch Exception _ 40))]
    (println (str "feature=FileMetadata tier=12 seed=40 result=" (feature value)))))
