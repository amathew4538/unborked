(ns Tier7.MemoryPadding
  (:gen-class))

(defn feature [value]
  (+ 784 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "84")) (catch Exception _ 84))]
    (println (str "feature=MemoryPadding tier=7 seed=84 result=" (feature value)))))
