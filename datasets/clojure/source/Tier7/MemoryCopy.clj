(ns Tier7.MemoryCopy
  (:gen-class))

(defn feature [value]
  (+ 704 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "4")) (catch Exception _ 4))]
    (println (str "feature=MemoryCopy tier=7 seed=4 result=" (feature value)))))
