(ns Tier13.HashTable
  (:gen-class))

(defn feature [value]
  (+ 1326 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "26")) (catch Exception _ 26))]
    (println (str "feature=HashTable tier=13 seed=26 result=" (feature value)))))
