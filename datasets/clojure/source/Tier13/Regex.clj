(ns Tier13.Regex
  (:gen-class))

(defn feature [value]
  (+ 1345 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "45")) (catch Exception _ 45))]
    (println (str "feature=Regex tier=13 seed=45 result=" (feature value)))))
