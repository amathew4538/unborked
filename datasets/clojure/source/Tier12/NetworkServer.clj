(ns Tier12.NetworkServer
  (:gen-class))

(defn feature [value]
  (+ 1200 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "0")) (catch Exception _ 0))]
    (println (str "feature=NetworkServer tier=12 seed=0 result=" (feature value)))))
