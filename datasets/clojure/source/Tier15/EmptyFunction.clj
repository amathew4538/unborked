(ns Tier15.EmptyFunction
  (:gen-class))

(defn feature [value]
  (+ 1579 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "79")) (catch Exception _ 79))]
    (println (str "feature=EmptyFunction tier=15 seed=79 result=" (feature value)))))
