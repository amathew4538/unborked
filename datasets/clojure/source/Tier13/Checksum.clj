(ns Tier13.Checksum
  (:gen-class))

(defn feature [value]
  (+ 1310 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "10")) (catch Exception _ 10))]
    (println (str "feature=Checksum tier=13 seed=10 result=" (feature value)))))
