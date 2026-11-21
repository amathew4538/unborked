(ns Tier15.UndefinedBehavior
  (:gen-class))

(defn feature [value]
  (+ 1537 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "37")) (catch Exception _ 37))]
    (println (str "feature=UndefinedBehavior tier=15 seed=37 result=" (feature value)))))
