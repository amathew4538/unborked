(ns Tier11.ParallelLoop
  (:gen-class))

(defn feature [value]
  (+ 1171 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "71")) (catch Exception _ 71))]
    (println (str "feature=ParallelLoop tier=11 seed=71 result=" (feature value)))))
