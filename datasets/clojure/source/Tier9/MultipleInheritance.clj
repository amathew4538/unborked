(ns Tier9.MultipleInheritance
  (:gen-class))

(defn feature [value]
  (+ 900 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "0")) (catch Exception _ 0))]
    (println (str "feature=MultipleInheritance tier=9 seed=0 result=" (feature value)))))
