(ns Tier7.MemoryMove
  (:gen-class))

(defn feature [value]
  (+ 725 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "25")) (catch Exception _ 25))]
    (println (str "feature=MemoryMove tier=7 seed=25 result=" (feature value)))))
