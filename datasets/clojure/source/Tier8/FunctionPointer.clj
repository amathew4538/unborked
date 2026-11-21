(ns Tier8.FunctionPointer
  (:gen-class))

(defn feature [value]
  (+ 830 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "30")) (catch Exception _ 30))]
    (println (str "feature=FunctionPointer tier=8 seed=30 result=" (feature value)))))
