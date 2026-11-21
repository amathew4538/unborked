(ns Tier11.ThreadCreate
  (:gen-class))

(defn feature [value]
  (+ 1114 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "14")) (catch Exception _ 14))]
    (println (str "feature=ThreadCreate tier=11 seed=14 result=" (feature value)))))
