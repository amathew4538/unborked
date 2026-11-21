(ns Tier7.References
  (:gen-class))

(defn feature [value]
  (+ 768 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "68")) (catch Exception _ 68))]
    (println (str "feature=References tier=7 seed=68 result=" (feature value)))))
