(ns Tier13.LinkedList
  (:gen-class))

(defn feature [value]
  (+ 1390 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "90")) (catch Exception _ 90))]
    (println (str "feature=LinkedList tier=13 seed=90 result=" (feature value)))))
