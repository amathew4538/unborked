(ns Tier14.DeadCodeElimination
  (:gen-class))

(defn feature [value]
  (+ 1432 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "32")) (catch Exception _ 32))]
    (println (str "feature=DeadCodeElimination tier=14 seed=32 result=" (feature value)))))
