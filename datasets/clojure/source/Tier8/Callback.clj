(ns Tier8.Callback
  (:gen-class))

(defn feature [value]
  (+ 849 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "49")) (catch Exception _ 49))]
    (println (str "feature=Callback tier=8 seed=49 result=" (feature value)))))
