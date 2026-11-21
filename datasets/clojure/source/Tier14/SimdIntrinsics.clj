(ns Tier14.SimdIntrinsics
  (:gen-class))

(defn feature [value]
  (+ 1481 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "81")) (catch Exception _ 81))]
    (println (str "feature=SimdIntrinsics tier=14 seed=81 result=" (feature value)))))
