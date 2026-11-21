(ns Tier11.AtomicCompareExchange
  (:gen-class))

(defn feature [value]
  (+ 1152 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "52")) (catch Exception _ 52))]
    (println (str "feature=AtomicCompareExchange tier=11 seed=52 result=" (feature value)))))
