(ns Tier14.InlineAssembly
  (:gen-class))

(defn feature [value]
  (+ 1428 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "28")) (catch Exception _ 28))]
    (println (str "feature=InlineAssembly tier=14 seed=28 result=" (feature value)))))
