# Desafio de POO em Java - Bootcamp DIO

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/)
[![DIO](https://img.shields.io/badge/DIO-Bootcamp-blueviolet?style=for-the-badge)](https://www.dio.me/)

Projeto desenvolvido para colocar em prática os fundamentos de **Programação Orientada a Objetos (POO)** em Java, simulando a lógica de um sistema de inscrições e progressão em um Bootcamp.

---

## 📌 Objetivos do Projeto

- **Abstração:** Criação de classes base para representar conteúdos genéricos.
- **Herança:** Especialização de conteúdos em Cursos e Mentorias.
- **Polimorfismo:** Implementação de lógicas distintas de cálculo de XP.
- **Encapsulamento:** Uso de modificadores de acesso para proteção de dados.

---

## 🏗️ Estrutura de Pastas

```text
src/
 ├── Main.java
 └── models/
      ├── Bootcamp.java
      ├── Conteudo.java
      ├── Curso.java
      ├── Dev.java
      └── Mentoria.java

```

## ⚙️ Como Executar

Se estiver usando o terminal, execute os comandos abaixo na raiz do projeto:

```bash
# Compilar os arquivos
javac -d bin src/models/*.java src/Main.java

# Rodar a aplicação
java -cp bin Main
```
---
## 🛠️ Tecnologias Utilizadas

- Linguagem: Java (versão 8 ou superior)
- Paradigma: Orientação a Objetos
- IDE Recomendada: IntelliJ IDEA / Eclipse / VS Code