(ns Tier15.ImplementationDefinedBehavior
  (:gen-class))

(defn feature [value]
  (+ 1507 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "7")) (catch Exception _ 7))]
    (println (str "feature=ImplementationDefinedBehavior tier=15 seed=7 result=" (feature value)))))
