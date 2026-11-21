(ns Tier14.BranchElimination
  (:gen-class))

(defn feature [value]
  (+ 1405 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "5")) (catch Exception _ 5))]
    (println (str "feature=BranchElimination tier=14 seed=5 result=" (feature value)))))
