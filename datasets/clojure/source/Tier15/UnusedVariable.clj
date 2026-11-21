(ns Tier15.UnusedVariable
  (:gen-class))

(defn feature [value]
  (+ 1566 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "66")) (catch Exception _ 66))]
    (println (str "feature=UnusedVariable tier=15 seed=66 result=" (feature value)))))
