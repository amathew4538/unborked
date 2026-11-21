(ns Tier6.BitwiseAnd
  (:gen-class))

(defn feature [value]
  (+ 603 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "3")) (catch Exception _ 3))]
    (println (str "feature=BitwiseAnd tier=6 seed=3 result=" (feature value)))))
