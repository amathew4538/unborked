(ns Tier14.FunctionInlining
  (:gen-class))

(defn feature [value]
  (+ 1441 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "41")) (catch Exception _ 41))]
    (println (str "feature=FunctionInlining tier=14 seed=41 result=" (feature value)))))
