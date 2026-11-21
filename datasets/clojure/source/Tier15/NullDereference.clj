(ns Tier15.NullDereference
  (:gen-class))

(defn feature [value]
  (+ 1526 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "26")) (catch Exception _ 26))]
    (println (str "feature=NullDereference tier=15 seed=26 result=" (feature value)))))
