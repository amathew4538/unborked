(ns Tier11.AtomicStore
  (:gen-class))

(defn feature [value]
  (+ 1157 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "57")) (catch Exception _ 57))]
    (println (str "feature=AtomicStore tier=11 seed=57 result=" (feature value)))))
