(ns Tier8.Closure
  (:gen-class))

(defn feature [value]
  (+ 845 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "45")) (catch Exception _ 45))]
    (println (str "feature=Closure tier=8 seed=45 result=" (feature value)))))
