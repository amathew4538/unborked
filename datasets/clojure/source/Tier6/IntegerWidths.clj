(ns Tier6.IntegerWidths
  (:gen-class))

(defn feature [value]
  (+ 621 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "21")) (catch Exception _ 21))]
    (println (str "feature=IntegerWidths tier=6 seed=21 result=" (feature value)))))
