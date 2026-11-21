(ns Tier9.StaticFields
  (:gen-class))

(defn feature [value]
  (+ 934 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "34")) (catch Exception _ 34))]
    (println (str "feature=StaticFields tier=9 seed=34 result=" (feature value)))))
