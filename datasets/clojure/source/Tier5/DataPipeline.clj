(ns Tier5.DataPipeline
  (:gen-class))

(defn -main []
  (let [processed (->> [1 2 3 4 5 6]
                       (filter even?)
                       (map #( * % %)))]
    (println "processed:" (count processed))
    (println "squares sum:" (reduce + processed)))
)
