(ns Tier13.RadixSort
  (:gen-class))

(defn feature [value]
  (+ 1374 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "74")) (catch Exception _ 74))]
    (println (str "feature=RadixSort tier=13 seed=74 result=" (feature value)))))
