(ns Tier8.Labels
  (:gen-class))

(defn feature [value]
  (+ 864 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "64")) (catch Exception _ 64))]
    (println (str "feature=Labels tier=8 seed=64 result=" (feature value)))))
