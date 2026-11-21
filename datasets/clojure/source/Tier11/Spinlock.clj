(ns Tier11.Spinlock
  (:gen-class))

(defn feature [value]
  (+ 1134 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "34")) (catch Exception _ 34))]
    (println (str "feature=Spinlock tier=11 seed=34 result=" (feature value)))))
