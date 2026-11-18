(ns Tier2.Conditional
  (:gen-class))

(defn classify [n]
  (cond
    (< n 0) "negative"
    (> n 0) "positive"
    :else "zero"))

(defn -main []
  (println (classify -1))
  (println (classify 0))
  (println (classify 1)))
