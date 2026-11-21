(ns Tier6.Constants
  (:gen-class))

(defn feature [value]
  (+ 627 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "27")) (catch Exception _ 27))]
    (println (str "feature=Constants tier=6 seed=27 result=" (feature value)))))
