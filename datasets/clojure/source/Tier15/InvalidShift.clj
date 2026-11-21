(ns Tier15.InvalidShift
  (:gen-class))

(defn feature [value]
  (+ 1518 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "18")) (catch Exception _ 18))]
    (println (str "feature=InvalidShift tier=15 seed=18 result=" (feature value)))))
