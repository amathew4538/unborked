(ns Tier6.BitwiseOr
  (:gen-class))

(defn feature [value]
  (+ 624 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "24")) (catch Exception _ 24))]
    (println (str "feature=BitwiseOr tier=6 seed=24 result=" (feature value)))))
