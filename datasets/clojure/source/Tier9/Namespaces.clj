(ns Tier9.Namespaces
  (:gen-class))

(defn feature [value]
  (+ 957 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "57")) (catch Exception _ 57))]
    (println (str "feature=Namespaces tier=9 seed=57 result=" (feature value)))))
