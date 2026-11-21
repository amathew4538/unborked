(ns Tier12.FileRead
  (:gen-class))

(defn feature [value]
  (+ 1211 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "11")) (catch Exception _ 11))]
    (println (str "feature=FileRead tier=12 seed=11 result=" (feature value)))))
