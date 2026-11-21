(ns Tier14.TailCallOptimization
  (:gen-class))

(defn feature [value]
  (+ 1459 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "59")) (catch Exception _ 59))]
    (println (str "feature=TailCallOptimization tier=14 seed=59 result=" (feature value)))))
