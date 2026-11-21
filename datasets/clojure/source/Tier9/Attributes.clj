(ns Tier9.Attributes
  (:gen-class))

(defn feature [value]
  (+ 906 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "6")) (catch Exception _ 6))]
    (println (str "feature=Attributes tier=9 seed=6 result=" (feature value)))))
