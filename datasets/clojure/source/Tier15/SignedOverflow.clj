(ns Tier15.SignedOverflow
  (:gen-class))

(defn feature [value]
  (+ 1565 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "65")) (catch Exception _ 65))]
    (println (str "feature=SignedOverflow tier=15 seed=65 result=" (feature value)))))
