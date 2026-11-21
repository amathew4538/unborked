(ns Tier6.BitwiseShift
  (:gen-class))

(defn feature [value]
  (+ 638 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "38")) (catch Exception _ 38))]
    (println (str "feature=BitwiseShift tier=6 seed=38 result=" (feature value)))))
