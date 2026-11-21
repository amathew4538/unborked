(ns Tier7.PassByReference
  (:gen-class))

(defn feature [value]
  (+ 720 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "20")) (catch Exception _ 20))]
    (println (str "feature=PassByReference tier=7 seed=20 result=" (feature value)))))
