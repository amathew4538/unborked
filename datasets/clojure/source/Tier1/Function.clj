(ns Tier1.Function
  (:gen-class))

(defn void_function []
  (println "Hello from the void function."))

(defn return_function []
  #_{:clj-kondo/ignore [:redundant-str-call]}
  (str "Hello from the return function."))

(defn parameter_function [a]
  (int (a + 1)))

(defn -main []
  (void_function)
  (println (return_function))
  (println (parameter_function 5)))
