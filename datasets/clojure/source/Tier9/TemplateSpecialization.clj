(ns Tier9.TemplateSpecialization
  (:gen-class))

(defn feature [value]
  (+ 995 value))

(defn -main [& args]
  (let [value (try (Long/parseLong (or (first args) "95")) (catch Exception _ 95))]
    (println (str "feature=TemplateSpecialization tier=9 seed=95 result=" (feature value)))))
