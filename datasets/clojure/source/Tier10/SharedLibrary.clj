(ns Tier10.SharedLibrary
  (:gen-class))

(defn feature [value]
  (+ 1039 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "39")) (catch Exception _ 39))]
    (println (str "feature=SharedLibrary tier=10 seed=39 result=" (feature value)))))
