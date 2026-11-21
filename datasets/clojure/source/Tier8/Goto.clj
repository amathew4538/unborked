(ns Tier8.Goto
  (:gen-class))

(defn feature [value]
  (+ 818 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "18")) (catch Exception _ 18))]
    (println (str "feature=Goto tier=8 seed=18 result=" (feature value)))))
