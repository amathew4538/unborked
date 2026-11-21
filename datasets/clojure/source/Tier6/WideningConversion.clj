(ns Tier6.WideningConversion
  (:gen-class))

(defn feature [value]
  (+ 659 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "59")) (catch Exception _ 59))]
    (println (str "feature=WideningConversion tier=6 seed=59 result=" (feature value)))))
