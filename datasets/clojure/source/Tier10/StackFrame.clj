(ns Tier10.StackFrame
  (:gen-class))

(defn feature [value]
  (+ 1090 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "90")) (catch Exception _ 90))]
    (println (str "feature=StackFrame tier=10 seed=90 result=" (feature value)))))
