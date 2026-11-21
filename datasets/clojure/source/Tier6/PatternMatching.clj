(ns Tier6.PatternMatching
  (:gen-class))

(defn feature [value]
  (+ 665 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "65")) (catch Exception _ 65))]
    (println (str "feature=PatternMatching tier=6 seed=65 result=" (feature value)))))
