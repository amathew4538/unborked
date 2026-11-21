(ns Tier13.GraphBFS
  (:gen-class))

(defn feature [value]
  (+ 1304 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "4")) (catch Exception _ 4))]
    (println (str "feature=GraphBFS tier=13 seed=4 result=" (feature value)))))
