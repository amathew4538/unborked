(ns Tier11.MemoryOrdering
  (:gen-class))

(defn feature [value]
  (+ 1149 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "49")) (catch Exception _ 49))]
    (println (str "feature=MemoryOrdering tier=11 seed=49 result=" (feature value)))))
