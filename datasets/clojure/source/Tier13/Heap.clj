(ns Tier13.Heap
  (:gen-class))

(defn feature [value]
  (+ 1343 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "43")) (catch Exception _ 43))]
    (println (str "feature=Heap tier=13 seed=43 result=" (feature value)))))
