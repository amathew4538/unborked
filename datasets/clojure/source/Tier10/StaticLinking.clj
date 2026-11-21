(ns Tier10.StaticLinking
  (:gen-class))

(defn feature [value]
  (+ 1026 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "26")) (catch Exception _ 26))]
    (println (str "feature=StaticLinking tier=10 seed=26 result=" (feature value)))))
