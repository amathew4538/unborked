(ns Tier15.EmptyLoop
  (:gen-class))

(defn feature [value]
  (+ 1568 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "68")) (catch Exception _ 68))]
    (println (str "feature=EmptyLoop tier=15 seed=68 result=" (feature value)))))
