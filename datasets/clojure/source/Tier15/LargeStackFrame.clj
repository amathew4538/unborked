(ns Tier15.LargeStackFrame
  (:gen-class))

(defn feature [value]
  (+ 1585 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "85")) (catch Exception _ 85))]
    (println (str "feature=LargeStackFrame tier=15 seed=85 result=" (feature value)))))
