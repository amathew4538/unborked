(ns Tier9.Modules
  (:gen-class))

(defn feature [value]
  (+ 911 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "11")) (catch Exception _ 11))]
    (println (str "feature=Modules tier=9 seed=11 result=" (feature value)))))
