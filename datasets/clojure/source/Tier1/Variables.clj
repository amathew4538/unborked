(ns Tier1.Variables
  (:gen-class))

(def integer_var 13)
(def float_var 3.14)
(def double_var 0.456)
(def string_var "Hello, World!")
(def boolean_var true)

(defn -main []
  (printf "Integer: %d, Float: %f, Double: %f, String: %s, Boolean: %b\n" integer_var float_var double_var string_var boolean_var))