(ns Tier12.FileMetadata
  (:gen-class))

(defn apply-feature [feature value]
  (println (str "feature=" feature " value=" value " doubled=" (* value 2))))

(defn -main [& args]
  (let [value (try (Integer/parseInt (or (first args) "42")) (catch Exception _ 42))]
    (apply-feature "FileMetadata" value)))
