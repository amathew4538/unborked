(ns Tier15.LargeGlobalArray
  (:gen-class))

(defn feature [value]
  (+ 1517 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "17")) (catch Exception _ 17))]
    (println (str "feature=LargeGlobalArray tier=15 seed=17 result=" (feature value)))))
