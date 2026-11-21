(ns Tier8.DefaultArguments
  (:gen-class))

(defn feature [value]
  (+ 863 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "63")) (catch Exception _ 63))]
    (println (str "feature=DefaultArguments tier=8 seed=63 result=" (feature value)))))
