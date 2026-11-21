(ns Tier14.BoundsCheckElimination
  (:gen-class))

(defn feature [value]
  (+ 1447 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "47")) (catch Exception _ 47))]
    (println (str "feature=BoundsCheckElimination tier=14 seed=47 result=" (feature value)))))
