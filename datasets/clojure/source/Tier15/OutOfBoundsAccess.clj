(ns Tier15.OutOfBoundsAccess
  (:gen-class))

(defn feature [value]
  (+ 1594 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "94")) (catch Exception _ 94))]
    (println (str "feature=OutOfBoundsAccess tier=15 seed=94 result=" (feature value)))))
