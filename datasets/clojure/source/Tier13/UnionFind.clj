(ns Tier13.UnionFind
  (:gen-class))

(defn feature [value]
  (+ 1387 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "87")) (catch Exception _ 87))]
    (println (str "feature=UnionFind tier=13 seed=87 result=" (feature value)))))
