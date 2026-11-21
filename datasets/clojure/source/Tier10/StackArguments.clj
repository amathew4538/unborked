(ns Tier10.StackArguments
  (:gen-class))

(defn feature [value]
  (+ 1086 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "86")) (catch Exception _ 86))]
    (println (str "feature=StackArguments tier=10 seed=86 result=" (feature value)))))
