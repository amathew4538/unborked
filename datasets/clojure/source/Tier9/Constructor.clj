(ns Tier9.Constructor
  (:gen-class))

(defn feature [value]
  (+ 987 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "87")) (catch Exception _ 87))]
    (println (str "feature=Constructor tier=9 seed=87 result=" (feature value)))))
