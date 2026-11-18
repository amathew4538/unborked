(ns Tier3.StringProcessing
  (:gen-class))

(defn -main []
  (let [input "Hello World!"]
    (println "upper:" (clojure.string/upper-case input))
    (println "reverse:" (clojure.string/reverse input))
    (println "words:" (count (clojure.string/split input #"\s+"))))
)
