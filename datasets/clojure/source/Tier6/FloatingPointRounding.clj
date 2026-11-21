(ns Tier6.FloatingPointRounding
  (:gen-class))

(defn feature [value]
  (+ 687 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "87")) (catch Exception _ 87))]
    (println (str "feature=FloatingPointRounding tier=6 seed=87 result=" (feature value)))))
