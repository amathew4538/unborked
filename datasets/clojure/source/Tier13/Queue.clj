(ns Tier13.Queue
  (:gen-class))

(defn feature [value]
  (+ 1339 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "39")) (catch Exception _ 39))]
    (println (str "feature=Queue tier=13 seed=39 result=" (feature value)))))
