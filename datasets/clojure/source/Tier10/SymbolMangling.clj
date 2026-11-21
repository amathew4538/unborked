(ns Tier10.SymbolMangling
  (:gen-class))

(defn feature [value]
  (+ 1038 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "38")) (catch Exception _ 38))]
    (println (str "feature=SymbolMangling tier=10 seed=38 result=" (feature value)))))
