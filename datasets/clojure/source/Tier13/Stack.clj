(ns Tier13.Stack
  (:gen-class))

(defn feature [value]
  (+ 1382 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "82")) (catch Exception _ 82))]
    (println (str "feature=Stack tier=13 seed=82 result=" (feature value)))))
