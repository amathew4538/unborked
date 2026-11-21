(ns Tier8.FunctionOverloading
  (:gen-class))

(defn feature [value]
  (+ 820 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "20")) (catch Exception _ 20))]
    (println (str "feature=FunctionOverloading tier=8 seed=20 result=" (feature value)))))
