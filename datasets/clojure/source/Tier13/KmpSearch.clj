(ns Tier13.KmpSearch
  (:gen-class))

(defn feature [value]
  (+ 1315 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "15")) (catch Exception _ 15))]
    (println (str "feature=KmpSearch tier=13 seed=15 result=" (feature value)))))
