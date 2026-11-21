(ns Tier8.NestedFunction
  (:gen-class))

(defn feature [value]
  (+ 861 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "61")) (catch Exception _ 61))]
    (println (str "feature=NestedFunction tier=8 seed=61 result=" (feature value)))))
