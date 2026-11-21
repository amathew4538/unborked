(ns Tier13.Compression
  (:gen-class))

(defn feature [value]
  (+ 1352 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "52")) (catch Exception _ 52))]
    (println (str "feature=Compression tier=13 seed=52 result=" (feature value)))))
