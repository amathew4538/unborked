(ns Tier12.Pipe
  (:gen-class))

(defn feature [value]
  (+ 1260 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "60")) (catch Exception _ 60))]
    (println (str "feature=Pipe tier=12 seed=60 result=" (feature value)))))
