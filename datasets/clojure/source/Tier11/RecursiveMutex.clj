(ns Tier11.RecursiveMutex
  (:gen-class))

(defn feature [value]
  (+ 1187 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "87")) (catch Exception _ 87))]
    (println (str "feature=RecursiveMutex tier=11 seed=87 result=" (feature value)))))
