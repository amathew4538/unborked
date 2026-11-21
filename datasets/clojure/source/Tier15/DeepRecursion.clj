(ns Tier15.DeepRecursion
  (:gen-class))

(defn feature [value]
  (+ 1559 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "59")) (catch Exception _ 59))]
    (println (str "feature=DeepRecursion tier=15 seed=59 result=" (feature value)))))
