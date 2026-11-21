(ns Tier8.MultipleReturnValues
  (:gen-class))

(defn feature [value]
  (+ 803 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "3")) (catch Exception _ 3))]
    (println (str "feature=MultipleReturnValues tier=8 seed=3 result=" (feature value)))))
