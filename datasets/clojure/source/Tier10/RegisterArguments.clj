(ns Tier10.RegisterArguments
  (:gen-class))

(defn feature [value]
  (+ 1064 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "64")) (catch Exception _ 64))]
    (println (str "feature=RegisterArguments tier=10 seed=64 result=" (feature value)))))
