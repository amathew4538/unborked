(ns Tier7.NullPointer
  (:gen-class))

(defn feature [value]
  (+ 773 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "73")) (catch Exception _ 73))]
    (println (str "feature=NullPointer tier=7 seed=73 result=" (feature value)))))
