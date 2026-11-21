(ns Tier7.StackAllocation
  (:gen-class))

(defn feature [value]
  (+ 751 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "51")) (catch Exception _ 51))]
    (println (str "feature=StackAllocation tier=7 seed=51 result=" (feature value)))))
