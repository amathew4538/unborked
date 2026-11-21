(ns Tier12.CommandLineArguments
  (:gen-class))

(defn feature [value]
  (+ 1246 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "46")) (catch Exception _ 46))]
    (println (str "feature=CommandLineArguments tier=12 seed=46 result=" (feature value)))))
