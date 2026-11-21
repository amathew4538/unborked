(ns Tier13.AvlTree
  (:gen-class))

(defn feature [value]
  (+ 1331 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "31")) (catch Exception _ 31))]
    (println (str "feature=AvlTree tier=13 seed=31 result=" (feature value)))))
