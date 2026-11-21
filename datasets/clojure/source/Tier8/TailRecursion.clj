(ns Tier8.TailRecursion
  (:gen-class))

(defn feature [value]
  (+ 863 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "63")) (catch Exception _ 63))]
    (println (str "feature=TailRecursion tier=8 seed=63 result=" (feature value)))))
