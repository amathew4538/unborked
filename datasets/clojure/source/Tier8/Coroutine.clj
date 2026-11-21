(ns Tier8.Coroutine
  (:gen-class))

(defn feature [value]
  (+ 830 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "30")) (catch Exception _ 30))]
    (println (str "feature=Coroutine tier=8 seed=30 result=" (feature value)))))
