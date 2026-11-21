(ns Tier11.ParallelReduction
  (:gen-class))

(defn feature [value]
  (+ 1145 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "45")) (catch Exception _ 45))]
    (println (str "feature=ParallelReduction tier=11 seed=45 result=" (feature value)))))
