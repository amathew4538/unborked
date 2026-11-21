(ns Tier10.GlobalVariables
  (:gen-class))

(defn feature [value]
  (+ 1066 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "66")) (catch Exception _ 66))]
    (println (str "feature=GlobalVariables tier=10 seed=66 result=" (feature value)))))
