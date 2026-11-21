(ns Tier7.Enum
  (:gen-class))

(defn feature [value]
  (+ 709 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "9")) (catch Exception _ 9))]
    (println (str "feature=Enum tier=7 seed=9 result=" (feature value)))))
