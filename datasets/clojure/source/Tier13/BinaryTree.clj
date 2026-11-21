(ns Tier13.BinaryTree
  (:gen-class))

(defn feature [value]
  (+ 1383 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "83")) (catch Exception _ 83))]
    (println (str "feature=BinaryTree tier=13 seed=83 result=" (feature value)))))
