(ns Tier15.LargeGlobalArray
  (:gen-class))

(defn apply-feature [feature value]
  (println (str "feature=" feature " value=" value " doubled=" (* value 2))))

(defn -main [& args]
  (let [value (try (Integer/parseInt (or (first args) "42")) (catch Exception _ 42))]
    (apply-feature "LargeGlobalArray" value)))
