(ns Tier8.EarlyReturn
  (:gen-class))

(defn feature [value]
  (+ 891 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "91")) (catch Exception _ 91))]
    (println (str "feature=EarlyReturn tier=8 seed=91 result=" (feature value)))))
