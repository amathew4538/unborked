(ns Tier6.TypeInference
  (:gen-class))

(defn feature [value]
  (+ 648 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "48")) (catch Exception _ 48))]
    (println (str "feature=TypeInference tier=6 seed=48 result=" (feature value)))))
