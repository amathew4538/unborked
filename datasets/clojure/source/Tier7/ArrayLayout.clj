(ns Tier7.ArrayLayout
  (:gen-class))

(defn feature [value]
  (+ 795 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "95")) (catch Exception _ 95))]
    (println (str "feature=ArrayLayout tier=7 seed=95 result=" (feature value)))))
