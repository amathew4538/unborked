(ns Tier7.Union
  (:gen-class))

(defn feature [value]
  (+ 762 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "62")) (catch Exception _ 62))]
    (println (str "feature=Union tier=7 seed=62 result=" (feature value)))))
