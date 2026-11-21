(ns Tier6.SwitchCase
  (:gen-class))

(defn feature [value]
  (+ 677 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "77")) (catch Exception _ 77))]
    (println (str "feature=SwitchCase tier=6 seed=77 result=" (feature value)))))
