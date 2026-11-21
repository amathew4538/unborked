(ns Tier12.SocketTCP
  (:gen-class))

(defn feature [value]
  (+ 1201 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "1")) (catch Exception _ 1))]
    (println (str "feature=SocketTCP tier=12 seed=1 result=" (feature value)))))
