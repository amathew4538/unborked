(ns Tier9.Annotations
  (:gen-class))

(defn feature [value]
  (+ 959 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "59")) (catch Exception _ 59))]
    (println (str "feature=Annotations tier=9 seed=59 result=" (feature value)))))
