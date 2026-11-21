(ns Tier10.StructReturn
  (:gen-class))

(defn feature [value]
  (+ 1047 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "47")) (catch Exception _ 47))]
    (println (str "feature=StructReturn tier=10 seed=47 result=" (feature value)))))
