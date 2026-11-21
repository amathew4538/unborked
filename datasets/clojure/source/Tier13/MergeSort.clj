(ns Tier13.MergeSort
  (:gen-class))

(defn feature [value]
  (+ 1316 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "16")) (catch Exception _ 16))]
    (println (str "feature=MergeSort tier=13 seed=16 result=" (feature value)))))
