(ns Tier12.StandardInput
  (:gen-class))

(defn feature [value]
  (+ 1224 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "24")) (catch Exception _ 24))]
    (println (str "feature=StandardInput tier=12 seed=24 result=" (feature value)))))
