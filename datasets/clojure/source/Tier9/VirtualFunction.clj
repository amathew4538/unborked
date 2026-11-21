(ns Tier9.VirtualFunction
  (:gen-class))

(defn feature [value]
  (+ 981 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "81")) (catch Exception _ 81))]
    (println (str "feature=VirtualFunction tier=9 seed=81 result=" (feature value)))))
