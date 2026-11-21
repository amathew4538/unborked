(ns Tier10.PositionIndependentExecutable
  (:gen-class))

(defn feature [value]
  (+ 1050 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "50")) (catch Exception _ 50))]
    (println (str "feature=PositionIndependentExecutable tier=10 seed=50 result=" (feature value)))))
