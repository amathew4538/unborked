(ns Tier7.NestedStruct
  (:gen-class))

(defn feature [value]
  (+ 738 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "38")) (catch Exception _ 38))]
    (println (str "feature=NestedStruct tier=7 seed=38 result=" (feature value)))))
