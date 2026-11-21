(ns Tier12.BinaryIO
  (:gen-class))

(defn feature [value]
  (+ 1238 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "38")) (catch Exception _ 38))]
    (println (str "feature=BinaryIO tier=12 seed=38 result=" (feature value)))))
