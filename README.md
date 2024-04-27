# ExerciciosSOLID
Exercícios de aplicação dos princípios SOLID

# Demeter
A pasta Demeter possui 4 arquivos, sendo eles a classe A, B, C e Main. Na classe main existe um método chamado doSomething() que utiliza o atributo c1 da classe C para chegar no atributo a3 da classe A. Desta forma, ele viola o principio de Demeter, pois segue uma longa sequência de classes para chegar no atributo procurado.

Neste novo commit foi alterado o atributo da main para um atributo da classe A, assim o método doSomething() não precisa conversar com "estranhos".

# ISP (Interface Segregation Principle)
A pasta ISP possui 3 arquivos, sendo eles a interface Funcionario e as classes Vendedor e Tecnico que implementam a interface. A ISP é violada aqui pois um Vendedor possui salário e comissão, porem um Tecnico não possui comissão, apenas salário.

Neste novo commit foi adicionado uma nova interface, a interface Comissao, agora Vendedor implementa Funcionario e Comissao, enquanto Tecnico emplementa apenas Funcionario.

# PrefiraCompAHeran (Prefira Composição a Herança)
A pasta PrefiraCompAHeran possui dois arquivos, sendo eles a classe Produto e Item. A classe Item herda produto, adquirindo todos os seus atributos e métodos. Neste caso, Item poderia ser composto de um Produto, tornando essa relação menos acoplada.

Neste novo commit foi removida a Herança de Produto em Item, agora Item possui um atributo do tipo Produto, sendo assim composto de Produto.

# SRP (Single Responsability Principle)
A pasta SRP possui um arquivo, a classe Pedido. A classe Pedido possui 4 métodos, criarPedido() - atualizarPedido() - registrarPedido() e gerarRelatorio(). A classe viola o SRP pois possui multiplicas responsabilidades: criar, atualizar e registrar pedidos, alem de gerar relatórios.

Neste novo commit foi apagado o metodo gerarRelatorio() e os metodos criarPedido() - atualizarPedido() - registrarPedido() tiveram suas responsabilidades transferiadas para um DAO. Podia-se criar um PedidoManager para distribuir ainda mais as responsabilidades também.