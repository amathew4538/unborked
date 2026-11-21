(ns Tier12.StandardError
  (:gen-class))

(defn feature [value]
  (+ 1249 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "49")) (catch Exception _ 49))]
    (println (str "feature=StandardError tier=12 seed=49 result=" (feature value)))))
