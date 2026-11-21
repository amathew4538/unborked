(ns Tier15.UnreachableCode
  (:gen-class))

(defn feature [value]
  (+ 1535 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "35")) (catch Exception _ 35))]
    (println (str "feature=UnreachableCode tier=15 seed=35 result=" (feature value)))))
