(ns Tier10.ThreadLocalStorage
  (:gen-class))

(defn feature [value]
  (+ 1021 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "21")) (catch Exception _ 21))]
    (println (str "feature=ThreadLocalStorage tier=10 seed=21 result=" (feature value)))))
