(ns Tier11.ThreadLocalVariables
  (:gen-class))

(defn feature [value]
  (+ 1100 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "0")) (catch Exception _ 0))]
    (println (str "feature=ThreadLocalVariables tier=11 seed=0 result=" (feature value)))))
