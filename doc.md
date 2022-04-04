# Revit | v-alpha

***

<details>
<summary> Comportamentos de componentes gerais  </summary>

 **Barras de progresso:** devem ser regressivas, e ter as cores alteradas (entre verde, amarelo, e vermelho) de acordo com a porcentagem atual.

 **Popup interativo:** devem ser popups com ação de toque programável, com uma barra de progresso vinculada a uma área alongável, (e um demonstrativo de que esse popup é tocável). Só pode ter um aberto por vez, quando outro for requisitado, o atual é fechado.

- **Ao tocar** checar se a área vinculada já pode ou deve ser alongada, e pergunta se quer alongar baseado no resultado.

- **Não pode/deve alongar:**
O app deve apresentar uma mensagem explicando o motivo de não poder/dever alongar naquele momento.

- **Pode/Deve alongar:**
O app deve perguntar se o usuário quer alongar agora.

- **Caso o usuário opte por *Não* alongar:**
O popup simplesmente fecha.

- **Caso o usuário opte por *Sim* (alongar):**
O usuário entra no *Fluxo de alongamentos*.

**Telas retrateis (direita e esquerda):** devem apresentar um botão lateral com a descrição na vertical quando retraídas, que quando tocados simulam um "swipe" (na direção oposta a que estão) até o final da tela, sobrepondo a tela principal.

**Barra inferior:** deve alternar entre as visualizações quando tocado[Visualização principal, Visualização Secundária].

**Botão de configuração:** deve ser visto no topo direito em todas as visualizações.

**Barra de progresso (geral):**  deve ter a porcentagem definida por um calculo que considera as porcentagens de todos alongamentos (*Cálculo-2*), ter uma rotina de atualização a cada 5 min. com o app aberto, e estar posicionada centralizada no topo em todas as visualizações.

</details>

<details>
<summary> Cálculos  </summary>

1. Cálculo das barras de progresso

2. Cálculo da barra de progresso geral

</details>

***
## Telas:

<details>
<summary> 1. Dados Pessoais </summary>

O app deve apresentar uma tela para que o usuario possa inserir seus dados. Para que consiga dar inicio aos alongamentos.

O app deve apresentar um campo obrigatório "Me identifico como:" do tipo Select, com as opções "Feminino" e "Masculino", que **ao selecionar** define uma identificação de gênero.

O app deve apresentar um campo obrigatório "Peso" do tipo Edit número decimal com a seguinte máscara (###,##), o campo deve aceitar somente valores acima de 0 e abaixo de 300.00.

O app deve apresentar um Button "Continuar" que só ficará selecionável quando o usuario preencher os campos acima. **Ao tocar**, segue para a *Tela-Principal*.

</details>

<details>
<summary> 2. Principal </summary>

Essa tela servirá como "ancora" do app, portanto, o app deve sempre abrir nessa tela após o usuário já ter inserido os dados pessoais.

<details>
<summary> 2.1 Visualização Principal </summary>

O app deve apresentar uma visualização com um avatar* interativo e mante-la como visualização principal do app.

> *O "avatar" é a ilustração de um corpo que dá acesso (toque) às áreas alongáveis

O app deve manter o avatar preenchento toda a tela, e centralizado.

O app deve ter ImgButtons das as áreas alongáveis, que **ao tocar** abre um *Popup interativo*. Cada área dessa deve ter 3 cores (verde, amarelo, e vermelho) indicando o progresso atual.

O app deve ter um ToggleButton (On/Off) que liga ou desliga os *Popups Interativos*.

- **On:** O app deve mostrar os *Popups Interativos* de todas as áreas alongáveis de uma vez só, e desabilita as áreas tocaveis do avatar.

- **Off:** O app deve fechar todos os *Popups Interativos* que podem estar a mostra, e mostrar apenas o *Popup Interativo* da área tocada pelo usuário.

O app deve ter um demonstrativo de progresso de hidratação expansível à esquerda, cuja a cor do card muda (verde, amarelo, e vermelho) de acordo com progresso atual.

- **Ao tocar** o demonstrativo deve expandir e mostrar a *Barra de progesso* de hidratação.

</details>

<details>
<summary> 2.2 Visualização Secundária </summary>

O app deve apresentar uma visualização com apenas as barras de progressos.

O app deve apresentar uma lista de todas as barras de progressos dos alongamento.

O app deve apresentar a barra de progresso da hidratação em uma uma seção separada.

</details>
</details>

<details>
<summary> 3. Fluxo de Alongamento </summary>

Detalhes

</details>


<details>
<summary> 4. Configurações </summary>

O app deve apresentar uma "tela" (um popup) para que o usuário faça alterações em seus dados pessoais.

O app deve apresentar um campo "Me identifico como:" do tipo Select, com as opções "Feminino" e "Masculino", que **ao selecionar** altera a identificação de gênero.

O app deve apresentar um campo "Peso" do tipo Edit número decimal com a seguinte máscara (###,##), o campo deve aceitar somente valores acima de 0 e abaixo de 300.00.

O app deve conter um Button "X" que **ao tocar** salva as alterarações e fecha o popup de configurações.

</details>
