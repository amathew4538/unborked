(ns Tier11.MemoryFence
  (:gen-class))

(defn feature [value]
  (+ 1142 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "42")) (catch Exception _ 42))]
    (println (str "feature=MemoryFence tier=11 seed=42 result=" (feature value)))))
