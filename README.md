# 🧮 Calculadora de Números Primos com Threads em Java

## 📝 Descrição

Este projeto é uma aplicação de console em **Java** desenvolvida para calcular números primos dentro de um intervalo numérico de forma otimizada.
A principal característica é o uso de **multithreading** para dividir a carga de processamento, permitindo que a verificação dos números seja executada em paralelo — o que melhora significativamente a performance em comparação com uma abordagem de thread única.

O repositório demonstra duas abordagens para a criação de threads em Java:

* **Herança da classe Thread** (`CalculoPrimos4.java`)
* **Implementação da interface Runnable** (`CalculoPrimoRunnable.java`)

---

## ✨ Funcionalidades

* **Cálculo de Números Primos:** Verifica e exibe todos os números primos em um intervalo pré-definido.
* **Processamento Paralelo:** Utiliza três threads para dividir o intervalo de busca e processar os números de forma concorrente.
* **Otimização:** A verificação de primalidade é feita de forma eficiente, testando divisores apenas até a raiz quadrada do número.
* **Código Didático:** Demonstra de maneira clara e objetiva duas formas de trabalhar com threads em Java.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java
* **Plataforma:** JDK (Java Development Kit) 21 ou superior

---

## 🚀 Como Executar o Projeto

### Pré-requisitos

* **Java Development Kit (JDK)** instalado na máquina.

### Passos para Execução

1. **Clone o repositório:**

   ```bash
   git clone <URL-DO-SEU-REPOSITORIO>
   cd <NOME-DO-DIRETORIO>
   ```

2. **Navegue até o diretório do código-fonte:**

   ```bash
   cd src
   ```

3. **Compile o arquivo Java desejado:**

   Para a versão com **Runnable**:

   ```bash
   javac CalculoPrimoRunnable.java
   ```

   Para a versão que **estende Thread**:

   ```bash
   javac CalculoPrimos4.java
   ```

4. **Execute o programa compilado:**

   Para a versão com **Runnable**:

   ```bash
   java CalculoPrimoRunnable
   ```

   Para a versão que **estende Thread**:

   ```bash
   java CalculoPrimos4
   ```

---

## 💡 Saída Esperada

Após a execução, o console exibirá a lista de números primos encontrados por cada thread, algo semelhante a isto:

```
[5-50] Primos encontrados:
5 7 11 13 17 19 23 29 31 37 41 43 47

[51-100] Primos encontrados:
53 59 61 67 71 73 79 83 89 97

[101-150] Primos encontrados:
101 103 107 109 113 127 131 137 139 149
```

> **Nota:** A ordem em que as threads finalizam e exibem seus resultados pode variar a cada execução, devido à natureza concorrente do programa.
