(ns Tier7.AllocationReallocationFree
  (:gen-class))

(defn feature [value]
  (+ 757 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "57")) (catch Exception _ 57))]
    (println (str "feature=AllocationReallocationFree tier=7 seed=57 result=" (feature value)))))
