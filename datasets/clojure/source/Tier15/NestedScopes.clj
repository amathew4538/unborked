(ns Tier15.NestedScopes
  (:gen-class))

(defn feature [value]
  (+ 1529 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "29")) (catch Exception _ 29))]
    (println (str "feature=NestedScopes tier=15 seed=29 result=" (feature value)))))
