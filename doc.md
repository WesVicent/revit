# Revit | v-alpha

***

## Telas:

<details>
<summary> Dados Pessoais </summary>

O app deve apresentar uma tela para que o usuario possa inserir seus dados. Para que consiga dar inicio aos alongamentos.

O app deve apresentar um campo obrigatório "Me identifico como:" do tipo Select, com as opções "Feminino" e "Masculino", que **ao selecionar** define uma identificação de gênero.

O app deve apresentar um campo obrigatório "Peso" do tipo Edit número decimal com a seguinte máscara (###,##), o campo deve aceitar somente valores acima de 0 e abaixo de 300.00.

O app deve apresentar um Button "Continuar" que só ficará selecionável quando o usuario preencher os campos acima. **Ao tocar**, segue para a *Tela-Principal*.

</details>

<details>
<summary> 1. Principal </summary>

Essa tela servirá como "ancora" do app, portanto, o app deve sempre abrir nessa tela após o usuário já ter inserido os dados pessoais.

<details>
<summary> Comportamentos de componentes gerais  </summary>

- **Barras de progresso:** devem ser regressivas, e ter as cores alteradas (entre verde, amarelo, e vermelho) de acordo com a porcentagem atual.

- **Telas retrateis (direita e esquerda):** devem apresentar um botão lateral com a descrição na vertical quando retraídas, que quando tocados simulam um "swipe" (na direção oposta a que estão) até o final da tela, sobrepondo a tela principal.

- **Barra inferior:** deve alternar entre as visualizações quando tocado[Visualização principal, Visualização Secundária].

- **Botão de configuração:** deve ser visto no topo direito em todas as visualizações.

- **Barra de progresso (geral):**  deve ter a porcentagem definida por um calculo que considera as porcentagens de todos alongamentos (*Cálculo-2*), ter uma rotina de atualização a cada 5 min. com o app aberto, e estar posicionada centralizada no topo em todas as visualizações.


</details>

<details>
<summary> 1.1 Visualização Principal </summary>

Detalhes

</details>

<details>
<summary> 1.2 Visualização Secundária </summary>

O app deve apresentar uma visualização apenas as barras de progressos.

O app deve apresentar uma lista de todas as barras de progressos dos alongamento.

O app deve apresentar a barra de progresso da hidratação em uma uma seção separada.

</details>

Detalhes

</details>

<details>
<summary> Configurações </summary>

O app deve apresentar uma "tela" (um popup) para que o usuário faça alterações em seus dados pessoais.

O app deve apresentar um campo "Me identifico como:" do tipo Select, com as opções "Feminino" e "Masculino", que **ao selecionar** altera a identificação de gênero.

O app deve apresentar um campo "Peso" do tipo Edit número decimal com a seguinte máscara (###,##), o campo deve aceitar somente valores acima de 0 e abaixo de 300.00.

O app deve conter um Button "X" que **ao tocar** salva as alterarações e fecha o popup de configurações.