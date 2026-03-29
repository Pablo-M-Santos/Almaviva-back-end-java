# 🧩 Desafio Sudoku em Java - Bootcamp DIO

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge\&logo=openjdk\&logoColor=white)](https://www.oracle.com/)
[![DIO](https://img.shields.io/badge/DIO-Bootcamp-blueviolet?style=for-the-badge)](https://www.dio.me/)

Projeto desenvolvido para colocar em prática os conceitos de **Programação Orientada a Objetos (POO)** em Java, implementando um jogo de **Sudoku interativo no terminal**.

---

## 📌 Objetivos do Projeto

* **Abstração:** Representação de cada posição do tabuleiro como uma entidade (`Celula`)
* **Encapsulamento:** Proteção dos dados e controle de acesso aos valores
* **Separação de responsabilidades:** Divisão entre modelo (`model`) e regras (`service`)
* **Validação de regras:** Implementação das regras clássicas do Sudoku (linha, coluna e bloco 3x3)
* **Interação via terminal:** Entrada de dados pelo usuário para simular jogadas

---

## 🧠 Regras Implementadas

* Não é permitido repetir números na mesma **linha**
* Não é permitido repetir números na mesma **coluna**
* Não é permitido repetir números no mesmo **bloco 3x3**
* Células fixas não podem ser alteradas

---

## 🏗️ Estrutura de Pastas

```text
src/
 └── br/com/dio/sudoku/
      ├── model/
      │    ├── Celula.java
      │    └── Tabuleiro.java
      ├── service/
      │    └── SudokuService.java
      └── Main.java
```

---

## ▶️ Como Executar

### ✔ Usando IDE (IntelliJ, Eclipse, VS Code)

1. Abra o projeto
2. Execute a classe `Main.java`
3. Insira os valores solicitados no terminal

---

### ✔ Usando Terminal

```bash
# Compilar
javac -d bin src/br/com/dio/sudoku/model/*.java src/br/com/dio/sudoku/service/*.java src/br/com/dio/sudoku/Main.java

# Executar
java -cp bin br.com.dio.sudoku.Main
```

---

## 🎮 Como Jogar

1. O tabuleiro será exibido no terminal
2. Você deve informar:

    * Linha (0 a 8)
    * Coluna (0 a 8)
    * Valor (1 a 9)
3. O sistema valida automaticamente a jogada

### ❌ Exemplo de jogada inválida:

* Número já existe na linha, coluna ou bloco
* Tentativa de alterar célula fixa

---

---

## 🛠️ Tecnologias Utilizadas

* Linguagem: Java (versão 8 ou superior)
* Paradigma: Programação Orientada a Objetos
* Entrada/Saída: Scanner (terminal)
* IDE Recomendada: IntelliJ IDEA / Eclipse / VS Code

---


## 📚 Aprendizados

Este projeto permitiu praticar:

* Estruturação de projetos Java
* Aplicação de conceitos de POO na prática
* Manipulação de matrizes (arrays bidimensionais)
* Validação de regras de negócio
* Interação com o usuário via terminal

---

## 🔗 Referência

Projeto inspirado no desafio proposto pela DIO:
https://github.com/digitalinnovationone/sudoku

