(ns Tier10.ExceptionUnwinding
  (:gen-class))

(defn feature [value]
  (+ 1037 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "37")) (catch Exception _ 37))]
    (println (str "feature=ExceptionUnwinding tier=10 seed=37 result=" (feature value)))))
