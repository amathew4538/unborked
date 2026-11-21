(ns Tier12.FileOpen
  (:gen-class))

(defn feature [value]
  (+ 1273 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "73")) (catch Exception _ 73))]
    (println (str "feature=FileOpen tier=12 seed=73 result=" (feature value)))))
