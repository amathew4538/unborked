(ns Tier3.BinarySearch
  (:gen-class))

(defn -main []
  (println "index:" (java.util.Collections/binarySearch [2 7 13 42 64 100] 42)))
