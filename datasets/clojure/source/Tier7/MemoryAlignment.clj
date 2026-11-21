(ns Tier7.MemoryAlignment
  (:gen-class))

(defn feature [value]
  (+ 744 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "44")) (catch Exception _ 44))]
    (println (str "feature=MemoryAlignment tier=7 seed=44 result=" (feature value)))))
