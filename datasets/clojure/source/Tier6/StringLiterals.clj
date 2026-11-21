(ns Tier6.StringLiterals
  (:gen-class))

(defn feature [value]
  (+ 645 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "45")) (catch Exception _ 45))]
    (println (str "feature=StringLiterals tier=6 seed=45 result=" (feature value)))))
