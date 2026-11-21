(ns Tier8.ClosureCapture
  (:gen-class))

(defn feature [value]
  (+ 802 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "2")) (catch Exception _ 2))]
    (println (str "feature=ClosureCapture tier=8 seed=2 result=" (feature value)))))
