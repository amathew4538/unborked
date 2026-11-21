(ns Tier9.NameMangling
  (:gen-class))

(defn feature [value]
  (+ 978 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "78")) (catch Exception _ 78))]
    (println (str "feature=NameMangling tier=9 seed=78 result=" (feature value)))))
