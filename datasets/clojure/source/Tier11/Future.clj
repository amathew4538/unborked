(ns Tier11.Future
  (:gen-class))

(defn feature [value]
  (+ 1165 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "65")) (catch Exception _ 65))]
    (println (str "feature=Future tier=11 seed=65 result=" (feature value)))))
