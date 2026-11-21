(ns Tier9.Interface
  (:gen-class))

(defn feature [value]
  (+ 948 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "48")) (catch Exception _ 48))]
    (println (str "feature=Interface tier=9 seed=48 result=" (feature value)))))
