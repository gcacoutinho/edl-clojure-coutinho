(defmacro or ; Sintaxe de definição de um macro
  ([] nil) ; Retorna nulo se não tiver argumentos
  ([x] x) ; Retorna o argumento, se existir só um
  ([x & next] ; Para 2 ou mais argumentos faz o seguinte
      `(let [or# ~x] ; Atribui ao símbolo único "or123" o valor de "x"
         (if or# or# ; Se o valor de "or123" for lógicamente verdadeiro, retorne ele
          (or ~@next))))) ; Se não, execute recursivamente para os próximos argumentos

(or nil false "teste")
