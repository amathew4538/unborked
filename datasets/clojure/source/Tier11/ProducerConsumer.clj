(ns Tier11.ProducerConsumer
  (:gen-class))

(defn feature [value]
  (+ 1175 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "75")) (catch Exception _ 75))]
    (println (str "feature=ProducerConsumer tier=11 seed=75 result=" (feature value)))))
