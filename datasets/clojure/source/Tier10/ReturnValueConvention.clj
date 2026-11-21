(ns Tier10.ReturnValueConvention
  (:gen-class))

(defn feature [value]
  (+ 1076 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "76")) (catch Exception _ 76))]
    (println (str "feature=ReturnValueConvention tier=10 seed=76 result=" (feature value)))))
