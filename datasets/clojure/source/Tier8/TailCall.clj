(ns Tier8.TailCall
  (:gen-class))

(defn feature [value]
  (+ 870 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "70")) (catch Exception _ 70))]
    (println (str "feature=TailCall tier=8 seed=70 result=" (feature value)))))
