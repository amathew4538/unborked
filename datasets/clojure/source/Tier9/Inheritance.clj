(ns Tier9.Inheritance
  (:gen-class))

(defn feature [value]
  (+ 901 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "1")) (catch Exception _ 1))]
    (println (str "feature=Inheritance tier=9 seed=1 result=" (feature value)))))
