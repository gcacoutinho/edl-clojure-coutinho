(defmacro unless
  "Parecido com if mas nega a condição"
  [condicao & codigo]
  `(if (not ~condicao)
    ~@codigo))

;; E então pode ser usada da seguinte forma
(let [x 10]
  (unless (= x 10)
    (println "x diferente de 10")
    (println "x é igual a 10"))) 
