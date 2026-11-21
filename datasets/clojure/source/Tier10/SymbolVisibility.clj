(ns Tier10.SymbolVisibility
  (:gen-class))

(defn feature [value]
  (+ 1015 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "15")) (catch Exception _ 15))]
    (println (str "feature=SymbolVisibility tier=10 seed=15 result=" (feature value)))))
