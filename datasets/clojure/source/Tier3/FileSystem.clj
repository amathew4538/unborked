(ns Tier3.FileSystem
  (:gen-class))

(defn -main []
  (spit "unborked_tier3.txt" "Hello, Dataset!")
  (let [content (slurp "unborked_tier3.txt")]
    (println "filesystem:" content)
    (clojure.java.io/delete-file "unborked_tier3.txt" true))
)
