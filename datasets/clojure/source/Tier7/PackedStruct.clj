(ns Tier7.PackedStruct
  (:gen-class))

(defn feature [value]
  (+ 745 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "45")) (catch Exception _ 45))]
    (println (str "feature=PackedStruct tier=7 seed=45 result=" (feature value)))))
