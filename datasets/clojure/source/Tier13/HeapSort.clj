(ns Tier13.HeapSort
  (:gen-class))

(defn feature [value]
  (+ 1337 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "37")) (catch Exception _ 37))]
    (println (str "feature=HeapSort tier=13 seed=37 result=" (feature value)))))
