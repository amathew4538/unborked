(ns Tier6.SignedUnsigned
  (:gen-class))

(defn feature [value]
  (+ 609 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "9")) (catch Exception _ 9))]
    (println (str "feature=SignedUnsigned tier=6 seed=9 result=" (feature value)))))
