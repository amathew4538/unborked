(ns Tier14.BranchlessOperations
  (:gen-class))

(defn feature [value]
  (+ 1492 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "92")) (catch Exception _ 92))]
    (println (str "feature=BranchlessOperations tier=14 seed=92 result=" (feature value)))))
