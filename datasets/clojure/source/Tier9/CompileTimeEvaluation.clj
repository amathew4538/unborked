(ns Tier9.CompileTimeEvaluation
  (:gen-class))

(defn feature [value]
  (+ 983 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "83")) (catch Exception _ 83))]
    (println (str "feature=CompileTimeEvaluation tier=9 seed=83 result=" (feature value)))))
