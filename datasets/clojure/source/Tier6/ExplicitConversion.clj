(ns Tier6.ExplicitConversion
  (:gen-class))

(defn feature [value]
  (+ 646 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "46")) (catch Exception _ 46))]
    (println (str "feature=ExplicitConversion tier=6 seed=46 result=" (feature value)))))
