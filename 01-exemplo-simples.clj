(defmacro unless
  "Parecido com if mas nega a condição"
  [condicao & codigo]   ; Recebe como parâmetro a condição
  `(if (not ~condicao)  ; Se a negação da condição for verdadeira
    ~@codigo))          ; Executa o código recebido

;; E então pode ser usada da seguinte forma
(let [x 10]
  (unless (= x 10)
    (println "x diferente de 10")
    (println "x é igual a 10")))
