(ns Tier12.BufferedIO
  (:gen-class))

(defn feature [value]
  (+ 1216 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "16")) (catch Exception _ 16))]
    (println (str "feature=BufferedIO tier=12 seed=16 result=" (feature value)))))
