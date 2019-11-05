# curso-java-Account

Códigos do curso online de java avançado na Udemy(https://www.udemy.com/share/1013hwA0cfdVlTQn4=/)

->Neste exercicio, foi criado uma classe base (Account) da qual outras duas classes herdam seus atributos e metodos (SavingsAccount e BusinessAccount).

->Foram testados no codigo a palavra instanceof para verificar se o objeto era uma instancia de uma classe especifica, para fazer o downcasting com segurança e fizemos exemplos de upcasting tambem, que sao mais simples, no programa principal.

->Aproveitando o codigo, foi implementada uma redefinicao do metodo da classe base, nas filhas (metodo withdraw), a fim de descontar uma taxa diferenciada para cada tipo de conta. Foi utilizada a palavra @override antes de redefinir o metodo nas classes base e utilizamos o metodo super dentro da classe filha, a fim de que ela repita o mesmo comportamento da mae e depois acrescente sua logica especifica.

No programa principal, sao criadas tres contas, uma instancia de cada tipo de classe e eh atribuido o mesmo saldo de 1000 reais e eh realizado em seguida um saque de 200 reais em cada conta. Como cada classe tem sua taxa diferenciada, a saida sera diferente para cada tipo de classe. Se a descricao nao ficou clara, o programa executa de acordo com o print do console demonstrado a seguir(Usando estes valores):

![](images/Capturar.PNG)

As classes foram implementadas seguindo o seguinte diagrama de Classes(Precisa so atualizar a imagem, para acrescentar o metodo withdraw na outra classe filha):

![](images/Capturar2.PNG)
