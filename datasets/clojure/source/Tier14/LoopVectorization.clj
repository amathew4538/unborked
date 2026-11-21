(ns Tier14.LoopVectorization
  (:gen-class))

(defn feature [value]
  (+ 1413 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "13")) (catch Exception _ 13))]
    (println (str "feature=LoopVectorization tier=14 seed=13 result=" (feature value)))))
