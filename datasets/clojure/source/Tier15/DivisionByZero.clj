(ns Tier15.DivisionByZero
  (:gen-class))

(defn feature [value]
  (+ 1592 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "92")) (catch Exception _ 92))]
    (println (str "feature=DivisionByZero tier=15 seed=92 result=" (feature value)))))
