(ns Tier11.Promise
  (:gen-class))

(defn feature [value]
  (+ 1189 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "89")) (catch Exception _ 89))]
    (println (str "feature=Promise tier=11 seed=89 result=" (feature value)))))
