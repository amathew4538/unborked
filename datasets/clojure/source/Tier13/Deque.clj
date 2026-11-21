(ns Tier13.Deque
  (:gen-class))

(defn feature [value]
  (+ 1330 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "30")) (catch Exception _ 30))]
    (println (str "feature=Deque tier=13 seed=30 result=" (feature value)))))
