(ns Tier11.Semaphore
  (:gen-class))

(defn feature [value]
  (+ 1129 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "29")) (catch Exception _ 29))]
    (println (str "feature=Semaphore tier=11 seed=29 result=" (feature value)))))
