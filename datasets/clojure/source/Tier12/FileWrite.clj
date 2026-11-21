(ns Tier12.FileWrite
  (:gen-class))

(defn feature [value]
  (+ 1243 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "43")) (catch Exception _ 43))]
    (println (str "feature=FileWrite tier=12 seed=43 result=" (feature value)))))
