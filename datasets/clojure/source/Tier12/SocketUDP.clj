(ns Tier12.SocketUDP
  (:gen-class))

(defn feature [value]
  (+ 1216 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "16")) (catch Exception _ 16))]
    (println (str "feature=SocketUDP tier=12 seed=16 result=" (feature value)))))
