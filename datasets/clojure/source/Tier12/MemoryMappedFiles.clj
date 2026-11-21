(ns Tier12.MemoryMappedFiles
  (:gen-class))

(defn feature [value]
  (+ 1254 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "54")) (catch Exception _ 54))]
    (println (str "feature=MemoryMappedFiles tier=12 seed=54 result=" (feature value)))))
