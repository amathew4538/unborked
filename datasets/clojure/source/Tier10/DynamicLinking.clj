(ns Tier10.DynamicLinking
  (:gen-class))

(defn feature [value]
  (+ 1091 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "91")) (catch Exception _ 91))]
    (println (str "feature=DynamicLinking tier=10 seed=91 result=" (feature value)))))
