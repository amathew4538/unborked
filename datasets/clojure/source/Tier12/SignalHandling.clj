(ns Tier12.SignalHandling
  (:gen-class))

(defn feature [value]
  (+ 1295 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "95")) (catch Exception _ 95))]
    (println (str "feature=SignalHandling tier=12 seed=95 result=" (feature value)))))
