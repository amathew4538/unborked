(ns Tier14.LoopUnrolling
  (:gen-class))

(defn feature [value]
  (+ 1416 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "16")) (catch Exception _ 16))]
    (println (str "feature=LoopUnrolling tier=14 seed=16 result=" (feature value)))))
