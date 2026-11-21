(ns Tier7.Endianness
  (:gen-class))

(defn feature [value]
  (+ 700 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "0")) (catch Exception _ 0))]
    (println (str "feature=Endianness tier=7 seed=0 result=" (feature value)))))
