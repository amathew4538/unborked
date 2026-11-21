(ns Tier11.AtomicLoad
  (:gen-class))

(defn feature [value]
  (+ 1146 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "46")) (catch Exception _ 46))]
    (println (str "feature=AtomicLoad tier=11 seed=46 result=" (feature value)))))
