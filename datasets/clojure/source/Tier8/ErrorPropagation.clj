(ns Tier8.ErrorPropagation
  (:gen-class))

(defn feature [value]
  (+ 844 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "44")) (catch Exception _ 44))]
    (println (str "feature=ErrorPropagation tier=8 seed=44 result=" (feature value)))))
