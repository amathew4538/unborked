(ns Tier6.BitwiseNot
  (:gen-class))

(defn feature [value]
  (+ 682 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "82")) (catch Exception _ 82))]
    (println (str "feature=BitwiseNot tier=6 seed=82 result=" (feature value)))))
