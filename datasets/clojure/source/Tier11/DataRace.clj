(ns Tier11.DataRace
  (:gen-class))

(defn feature [value]
  (+ 1196 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "96")) (catch Exception _ 96))]
    (println (str "feature=DataRace tier=11 seed=96 result=" (feature value)))))
