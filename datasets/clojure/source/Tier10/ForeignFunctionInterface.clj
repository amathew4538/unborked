(ns Tier10.ForeignFunctionInterface
  (:gen-class))

(defn feature [value]
  (+ 1073 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "73")) (catch Exception _ 73))]
    (println (str "feature=ForeignFunctionInterface tier=10 seed=73 result=" (feature value)))))
