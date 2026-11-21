(ns Tier15.UnspecifiedBehavior
  (:gen-class))

(defn feature [value]
  (+ 1562 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "62")) (catch Exception _ 62))]
    (println (str "feature=UnspecifiedBehavior tier=15 seed=62 result=" (feature value)))))
