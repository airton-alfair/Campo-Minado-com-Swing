# 💣 Campo Minado com Swing — Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-GUI-blue?style=for-the-badge)
![POO](https://img.shields.io/badge/OOP-Architecture-green?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge)

Implementação gráfica do clássico **Campo Minado**, desenvolvida em **Java com Swing**, evoluindo a versão anterior feita em terminal.

Este projeto demonstra reutilização de código, arquitetura modular e aplicação prática de eventos gráficos.

---

## 🎯 Visão Geral

Esta versão mantém toda a lógica do jogo desenvolvida anteriormente (modelo robusto e organizado) e adiciona:

- 🖱️ Interface gráfica interativa
- 🎮 Controle via clique do mouse
- 🔁 Marcação e desmarcação com botão direito
- 💥 Abertura dinâmica com botão esquerdo
- 🏆 Feedback visual de vitória e derrota

---

## 🧠 Arquitetura do Projeto

O projeto segue separação clara de responsabilidades:

Modelo (Lógica do Jogo)  
↓  
Interface Gráfica (Swing)

### 📦 Modelo
Responsável por:
- Representação do campo
- Geração do tabuleiro
- Sorteio de minas
- Abertura recursiva
- Verificação de vitória
- Tratamento de explosão

### 🖥️ Interface Swing
Responsável por:
- Renderização visual do tabuleiro
- Captura de eventos de mouse
- Atualização dinâmica dos botões
- Feedback ao jogador

---

## 🖱️ Controles

| Ação | Comando |
|------|---------|
| Abrir campo | Clique esquerdo |
| Marcar / Desmarcar | Clique direito |

---

## 🛠️ Tecnologias Utilizadas

- Java (JDK 8+)
- Swing
- Programação Orientada a Objetos
- Eventos de Mouse (MouseListener)
- Tratamento de exceções personalizadas
- Reutilização de código

---

## ♻️ Evolução do Projeto

Este projeto é a continuação da versão Console.

Evolução aplicada:

- Interface textual → Interface gráfica
- Scanner → Eventos de Mouse
- Terminal → Componentes Swing
- Manutenção da lógica central intacta

Demonstra capacidade de:
- Refatoração
- Reaproveitamento de código
- Evolução incremental de software


  
---

## ▶️ Como Executar
Execute a classe TelaPrincipal

br.com.projeto.cm.visao.TelaPrincipal

---

  ## 🚀 Próximas Evoluções Planejadas

- Sistema de níveis (Fácil, Médio, Difícil)
- Contador de tempo
- Menu superior (Novo jogo / Reiniciar)
- Sistema de pontuação
- Testes unitários (JUnit)

---

### 👨‍💻 Autor
Projeto desenvolvido para fins de estudo e prática de Java.

---

### 📄 Licença
Uso livre para fins educacionais.
