(ns Tier8.Generator
  (:gen-class))

(defn feature [value]
  (+ 835 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "35")) (catch Exception _ 35))]
    (println (str "feature=Generator tier=8 seed=35 result=" (feature value)))))
