(ns Tier14.ConstantFolding
  (:gen-class))

(defn feature [value]
  (+ 1404 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "4")) (catch Exception _ 4))]
    (println (str "feature=ConstantFolding tier=14 seed=4 result=" (feature value)))))
