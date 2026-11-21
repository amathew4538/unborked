(ns Tier7.Slice
  (:gen-class))

(defn feature [value]
  (+ 760 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "60")) (catch Exception _ 60))]
    (println (str "feature=Slice tier=7 seed=60 result=" (feature value)))))
