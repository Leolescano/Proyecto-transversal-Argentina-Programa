# Projeto Transversal - Sistema de Gestão "Universidad de La Punta"

Este é um projeto desenvolvido como parte do curso "Argentina Programa". Trata-se de uma aplicação de desktop em Java Swing para gerenciar alunos, matérias e inscrições de uma instituição de ensino, modelado para a "Universidad de La Punta" (ULP).

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)

## 🚀 Funcionalidades Principais

O sistema oferece uma interface gráfica intuitiva para realizar as seguintes operações:

*   **Gestão de Alunos:**
    *   Adicionar novos alunos ao sistema.
    *   Buscar alunos existentes por DNI.
    *   Atualizar informações dos alunos.
    *   Excluir alunos (exclusão lógica, alterando seu estado para inativo).

*   **Gestão de Matérias:**
    *   Funcionalidade para administrar as matérias oferecidas pela universidade (adição, edição, exclusão).

*   **Gestão de Inscrições:**
    *   Permite inscrever alunos em matérias disponíveis.
    *   Anular inscrições previamente realizadas.
    *   Visualizar matérias em que um aluno está inscrito ou não.

*   **Manipulação de Notas:**
    *   Módulo para carregar e atualizar as notas dos alunos nas matérias em que estão inscritos.

*   **Consultas:**
    *   Gerar listas de alunos por matéria, facilitando a visualização e organização acadêmica.

## 🛠️ Tecnologias Utilizadas

*   **Linguagem:** Java
*   **Interface Gráfica:** Java Swing
*   **Banco de Dados:** MySQL / MariaDB
*   **Conectividade com BD:** Driver JDBC
*   **IDE de Desenvolvimento:** Apache NetBeans
*   **Componentes Externos:** Biblioteca JCalendar para seleção de datas.

## 🖼️ Telas da Aplicação

Abaixo estão algumas das principais telas do sistema.

**Formulário de Alunos:**
*Interface para adicionar, buscar e gerenciar os dados dos alunos.*
 <!-- Substitua com o link da sua imagem -->

**Formulário de Inscrições:**
*Tela para matricular um aluno em uma matéria ou cancelar uma matrícula.*
 <!-- Substitua com o link da sua imagem -->

**Consulta de Alunos por Matéria:**
*Permite selecionar uma matéria e listar todos os alunos inscritos nela.*
 <!-- Substitua com o link da sua imagem -->

## ⚙️ Como Executar o Projeto

Siga os passos abaixo para configurar e executar o projeto em seu ambiente local.

1.  **Clonar o Repositório:**
    ```bash
    git clone https://github.com/Leolescano/Proyecto-transversal-Argentina-Programa.git
    ```

2.  **Configurar o Banco de Dados:**
    *   Certifique-se de ter um servidor MySQL ou MariaDB em execução.
    *   Crie um banco de dados (por exemplo, `universidad_ulp`).
    *   Importe o script SQL (`.sql`) do projeto para criar as tabelas e as relações necessárias.

3.  **Configurar a Conexão:**
    *   Abra o projeto no NetBeans IDE.
    *   Localize a classe de conexão (geralmente em um pacote como `accesoADatos/Conexion.java`).
    *   Verifique e, se necessário, ajuste os parâmetros de conexão com o banco de dados (URL, nome do banco, usuário e senha).

4.  **Executar a Aplicação:**
    *   Localize a classe principal que contém o `main` e inicia a interface gráfica (a classe com o `JDesktopPane` ou `JFrame` principal).
    *   Clique com o botão direito sobre o arquivo e selecione "Run File".

## 📂 Estrutura do Projeto

O código-fonte está organizado em pacotes para seguir as boas práticas de desenvolvimento:

*   `ulp_ap_grupo_16.entidades`: Contém as classes de modelo (POJOs) que representam as entidades do negócio, como `Alumno`, `Materia` e `Inscripcion`.
*   `ulp_ap_grupo_16.accesoADatos`: Contém as classes DAO (Data Access Object), responsáveis por toda a lógica de persistência e comunicação com o banco de dados (ex: `AlumnoData`, `InscripcionData`).
*   `ulp_ap_grupo_16.vistas`: Contém todos os formulários (`JInternalFrame`) que compõem a interface gráfica do usuário.

---

*Projeto desenvolvido por Leonardo Lescano para o bootcamp Argentina Programa.*