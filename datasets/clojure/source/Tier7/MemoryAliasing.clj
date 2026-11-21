(ns Tier7.MemoryAliasing
  (:gen-class))

(defn feature [value]
  (+ 716 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "16")) (catch Exception _ 16))]
    (println (str "feature=MemoryAliasing tier=7 seed=16 result=" (feature value)))))
