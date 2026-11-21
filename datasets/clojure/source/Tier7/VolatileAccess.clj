(ns Tier7.VolatileAccess
  (:gen-class))

(defn feature [value]
  (+ 708 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "8")) (catch Exception _ 8))]
    (println (str "feature=VolatileAccess tier=7 seed=8 result=" (feature value)))))
