(ns Tier7.DynamicArray
  (:gen-class))

(defn feature [value]
  (+ 750 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "50")) (catch Exception _ 50))]
    (println (str "feature=DynamicArray tier=7 seed=50 result=" (feature value)))))
