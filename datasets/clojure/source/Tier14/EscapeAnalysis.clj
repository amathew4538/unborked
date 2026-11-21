(ns Tier14.EscapeAnalysis
  (:gen-class))

(defn feature [value]
  (+ 1466 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "66")) (catch Exception _ 66))]
    (println (str "feature=EscapeAnalysis tier=14 seed=66 result=" (feature value)))))
