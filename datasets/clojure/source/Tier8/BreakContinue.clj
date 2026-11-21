(ns Tier8.BreakContinue
  (:gen-class))

(defn feature [value]
  (+ 894 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "94")) (catch Exception _ 94))]
    (println (str "feature=BreakContinue tier=8 seed=94 result=" (feature value)))))
