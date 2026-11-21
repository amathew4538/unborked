(ns Tier13.Trie
  (:gen-class))

(defn feature [value]
  (+ 1361 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "61")) (catch Exception _ 61))]
    (println (str "feature=Trie tier=13 seed=61 result=" (feature value)))))
