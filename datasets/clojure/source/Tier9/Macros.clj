(ns Tier9.Macros
  (:gen-class))

(defn feature [value]
  (+ 938 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "38")) (catch Exception _ 38))]
    (println (str "feature=Macros tier=9 seed=38 result=" (feature value)))))
