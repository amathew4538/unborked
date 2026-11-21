(ns Tier15.UseAfterFree
  (:gen-class))

(defn feature [value]
  (+ 1536 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "36")) (catch Exception _ 36))]
    (println (str "feature=UseAfterFree tier=15 seed=36 result=" (feature value)))))
