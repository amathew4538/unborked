(ns Tier6.Comparison
  (:gen-class))

(defn feature [value]
  (+ 670 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "70")) (catch Exception _ 70))]
    (println (str "feature=Comparison tier=6 seed=70 result=" (feature value)))))
