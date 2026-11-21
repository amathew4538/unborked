(ns Tier3.Matrix
  (:gen-class))

(defn -main []
  (let [left [[1 2 3] [4 5 6]]
        right [[7 8] [9 10] [11 12]]]
    (doseq [row left]
      (println (apply str (interpose " "
                                     (for [column (range 2)]
                                       (apply + (map * row (map #(nth % column) right))))))))))
