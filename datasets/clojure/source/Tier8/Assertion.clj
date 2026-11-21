(ns Tier8.Assertion
  (:gen-class))

(defn feature [value]
  (+ 873 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "73")) (catch Exception _ 73))]
    (println (str "feature=Assertion tier=8 seed=73 result=" (feature value)))))
