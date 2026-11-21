(ns Tier13.HashSet
  (:gen-class))

(defn feature [value]
  (+ 1347 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "47")) (catch Exception _ 47))]
    (println (str "feature=HashSet tier=13 seed=47 result=" (feature value)))))
