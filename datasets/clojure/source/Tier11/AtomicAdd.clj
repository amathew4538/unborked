(ns Tier11.AtomicAdd
  (:gen-class))

(defn feature [value]
  (+ 1172 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "72")) (catch Exception _ 72))]
    (println (str "feature=AtomicAdd tier=11 seed=72 result=" (feature value)))))
