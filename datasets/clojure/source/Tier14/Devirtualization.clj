(ns Tier14.Devirtualization
  (:gen-class))

(defn feature [value]
  (+ 1492 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "92")) (catch Exception _ 92))]
    (println (str "feature=Devirtualization tier=14 seed=92 result=" (feature value)))))
