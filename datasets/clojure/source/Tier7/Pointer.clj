(ns Tier7.Pointer
  (:gen-class))

(defn feature [value]
  (+ 734 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "34")) (catch Exception _ 34))]
    (println (str "feature=Pointer tier=7 seed=34 result=" (feature value)))))
