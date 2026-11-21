(ns Tier15.StrictAliasing
  (:gen-class))

(defn feature [value]
  (+ 1535 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "35")) (catch Exception _ 35))]
    (println (str "feature=StrictAliasing tier=15 seed=35 result=" (feature value)))))
