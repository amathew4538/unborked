(ns Tier4.PrimeSieve
  (:gen-class))

(defn -main []
  (let [limit 30
        prime (boolean-array (inc limit))]
    (dotimes [i (inc limit)] (when (>= i 2) (aset prime i true)))
    (doseq [i (range 2 (inc (int (Math/sqrt limit)))) :when (aget prime i)]
      (doseq [multiple (range (* i i) (inc limit) i)] (aset prime multiple false)))
    (print "primes:")
    (doseq [i (range 2 (inc limit)) :when (aget prime i)] (print "" i))
    (println)))
