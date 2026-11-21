(ns Tier7.HeapAllocation
  (:gen-class))

(defn feature [value]
  (+ 749 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "49")) (catch Exception _ 49))]
    (println (str "feature=HeapAllocation tier=7 seed=49 result=" (feature value)))))
