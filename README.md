# java-colecoes-listas
Projeto Alura `Aplicações de Compras` em Java para praticar coleções e lista.

Criamos uma conta com um nome e valor disponivel. E realizamos o cadastro de produtos e compramos eles
de acordo com saldo disponivel em conta. Podemos finalizar, continuar comprando e fechar uma compra. Existe validações para não comprar
além do saldo em conta.

Esquema:
```
Produto
-nome
-valor
-quantidade


Conta
-nome
-saldo


Compra
-conta
-lista de produtos
-valor total


```