(ns Tier9.GenericConstraints
  (:gen-class))

(defn feature [value]
  (+ 976 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "76")) (catch Exception _ 76))]
    (println (str "feature=GenericConstraints tier=9 seed=76 result=" (feature value)))))
