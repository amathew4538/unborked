(ns Tier12.StandardOutput
  (:gen-class))

(defn feature [value]
  (+ 1223 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "23")) (catch Exception _ 23))]
    (println (str "feature=StandardOutput tier=12 seed=23 result=" (feature value)))))
