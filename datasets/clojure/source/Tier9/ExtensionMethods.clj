(ns Tier9.ExtensionMethods
  (:gen-class))

(defn feature [value]
  (+ 977 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "77")) (catch Exception _ 77))]
    (println (str "feature=ExtensionMethods tier=9 seed=77 result=" (feature value)))))
