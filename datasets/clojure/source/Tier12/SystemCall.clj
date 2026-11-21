(ns Tier12.SystemCall
  (:gen-class))

(defn feature [value]
  (+ 1261 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "61")) (catch Exception _ 61))]
    (println (str "feature=SystemCall tier=12 seed=61 result=" (feature value)))))
