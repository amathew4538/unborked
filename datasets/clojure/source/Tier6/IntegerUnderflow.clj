(ns Tier6.IntegerUnderflow
  (:gen-class))

(defn feature [value]
  (+ 667 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "67")) (catch Exception _ 67))]
    (println (str "feature=IntegerUnderflow tier=6 seed=67 result=" (feature value)))))
