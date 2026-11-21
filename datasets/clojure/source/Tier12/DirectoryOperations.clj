(ns Tier12.DirectoryOperations
  (:gen-class))

(defn feature [value]
  (+ 1272 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "72")) (catch Exception _ 72))]
    (println (str "feature=DirectoryOperations tier=12 seed=72 result=" (feature value)))))
