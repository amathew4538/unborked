(ns Tier9.MethodOverloading
  (:gen-class))

(defn feature [value]
  (+ 906 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "6")) (catch Exception _ 6))]
    (println (str "feature=MethodOverloading tier=9 seed=6 result=" (feature value)))))
