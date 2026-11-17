(ns Tier2.Recursion (:gen-class))
(defn factorial [n] (if (<= n 1) 1 (* n (factorial (dec n)))))
(defn -main [] (println (factorial 5)))
