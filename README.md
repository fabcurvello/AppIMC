<p align="center">
  <img src="app/src/main/res/drawable-v24/balanca.png" width="110" alt="Balança" />
</p>

<h1 align="center">Calculadora de IMC — Android Nativo com Java</h1>

<p align="center">
  App didático de Android nativo usado nas aulas de <strong>Computação para Dispositivos Móveis</strong> que ministro no <strong>Centro Universitário IBMR (Ânima Educação)</strong>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Android-3DDC84?style=flat&logo=android&logoColor=white" alt="Android" />
  <img src="https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/Android%20Studio-3DDC84?style=flat&logo=androidstudio&logoColor=white" alt="Android Studio" />
  <img src="https://img.shields.io/badge/status-conclu%C3%ADdo-success?style=flat" alt="Status: concluído" />
  <img src="https://img.shields.io/badge/IBMR-%C3%82nima%20Educa%C3%A7%C3%A3o-1F3A93?style=flat" alt="IBMR - Ânima Educação" />
</p>

---

## Sobre este repositório

A **Calculadora de IMC** foi desenvolvida junto com os alunos nas aulas de **Computação para Dispositivos Móveis** que ministro no **Centro Universitário IBMR (Ânima Educação)**.

O usuário informa o peso e a altura, toca em **"Calcular"**, e o app mostra o Índice de Massa Corporal e a classificação correspondente, de "Abaixo do peso" a "Obesidade grau 3".

É um problema do dia a dia que todo aluno entende na hora, e por isso funciona tão bem em sala. A fórmula é simples, mas o app reúne em poucas linhas os pilares de qualquer aplicativo: entrada de dados, processamento, decisão e exibição do resultado. Cada aluno testa com os próprios números e vê o código responder.

Esta é a primeira versão do app, criada em 2023 para as turmas de Computação para Dispositivos Móveis do IBMR.

> ✅ **Projeto concluído:** o app está completo e serve como gabarito para revisão e prática dos alunos.

## Como o app funciona

| Etapa | O que acontece |
|---|---|
| Entrada | O usuário digita peso (kg) e altura (m) em campos numéricos ("SUA ALTURA" e "SEU PESO") |
| Cálculo | Ao tocar em **"Calcular"**, o app calcula `IMC = peso / altura²` |
| Classificação | Uma cadeia de `if/else if` enquadra o valor na faixa correta |
| Saída | O IMC e a situação aparecem na tela |

**Faixas de classificação:** abaixo de 18,5 · abaixo de 25 · abaixo de 30 · abaixo de 35 · abaixo de 40 · a partir de 40

## O que se aprende com este app

- **Estrutura de um projeto Android:** `Activity`, `onCreate()`, layout em XML e a classe `R`
- **Ligação entre XML e Java:** recuperar componentes com `findViewById()`
- **Entrada de dados:** `EditText` com `inputType="numberDecimal"` para aceitar apenas números decimais
- **Conversão de tipos:** de `String` para `double` com `Double.parseDouble()`
- **Evento de clique:** `setOnClickListener()` com classe anônima `View.OnClickListener`
- **Modularização:** métodos separados para calcular o IMC e para classificar a situação (`calcularImc()` e `situacaoImc()`)
- **Estruturas de decisão:** `if / else if / else` com faixas de valores
- **Saída de dados:** `setText()` para exibir o resultado em `TextView`

## Tecnologias

| Categoria | Ferramentas |
|---|---|
| Plataforma | Android nativo |
| Linguagem | Java |
| IDE | Android Studio |
| Layout | XML com ConstraintLayout |
| Configuração | compileSdk 32 · minSdk 25 (Android 7.1) |

Pacote: `com.example.imc`

## Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/fabcurvello/AppIMC.git
   ```
2. Abra a pasta do projeto no **Android Studio** e aguarde a sincronização do Gradle.
3. Execute em um emulador ou em um celular Android com a depuração USB ativada.

## Desafios para praticar

- Validar campos vazios antes de calcular, evitando que o app feche com erro
- Aceitar a altura em centímetros e converter para metros no código
- Mudar a cor do texto da situação conforme a faixa de IMC
- Adicionar um botão para limpar os campos

## Sobre o professor

**Fabricio Curvello** é desenvolvedor e professor de desenvolvimento de software. Leciona no SENAI-RJ desde 1997, em cursos de programação, banco de dados, web e desenvolvimento fullstack, e no Centro Universitário IBMR desde 2018, nos cursos de Análise e Desenvolvimento de Sistemas, Ciência da Computação e Gestão de TI.

No desenvolvimento mobile, usa apps curtos, visuais e com propósito claro para ensinar Android nativo com Java. A ideia é que cada conceito apareça funcionando na tela do celular do aluno, o que mantém a turma motivada e torna a prática de código mais eficiente.

- LinkedIn: [linkedin.com/in/fabriciocurvello](https://www.linkedin.com/in/fabriciocurvello)
- YouTube: [@fabriciocurvello](https://www.youtube.com/@fabriciocurvello)
- GitHub: [github.com/fabcurvello](https://github.com/fabcurvello)
- Currículo Lattes: [lattes.cnpq.br/2406072276749635](http://lattes.cnpq.br/2406072276749635)

---

<p align="center">
  Material de apoio às aulas de Computação para Dispositivos Móveis do Centro Universitário IBMR (Ânima Educação).
</p>
