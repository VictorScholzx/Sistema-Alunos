# 🎓 Sistema de Alunos

Sistema web para gerenciamento de alunos desenvolvido com **Spring Boot** (backend) e **Thymeleaf** (frontend). Permite cadastrar, listar, editar e excluir alunos de forma simples e intuitiva.

## 📋 Funcionalidades

- ✅ **Listar alunos** – Visualize todos os alunos cadastrados em uma tabela organizada.
- ✅ **Cadastrar novo aluno** – Adicione alunos com nome, email, curso e idade.
- ✅ **Editar aluno** – Atualize os dados de um aluno existente.
- ✅ **Excluir aluno** – Remova alunos do sistema (com confirmação).
- ✅ **Validação básica** – Campos obrigatórios no formulário.
- ✅ **Mensagens de feedback** – Alertas de sucesso/erro após operações.

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Versão | Descrição |
|------------|--------|-----------|
| **Java** | 21+ | Linguagem de programação |
| **Spring Boot** | 3.x | Framework para aplicações Java |
| **Spring Web** | - | Módulo para criação de APIs e MVC |
| **Thymeleaf** | - | Motor de templates para HTML |
| **CSS3** | - | Estilização das páginas |
| **Maven** | - | Gerenciamento de dependências |

## 🚀 Como Executar o Projeto

### Pré-requisitos

- Java 21 ou superior instalado
- Maven instalado (ou utilize o wrapper `./mvnw` incluso no projeto)
- Git (opcional, para clonar)

### Passos

1. **Clone o repositório**
   ```bash
   git clone https://github.com/VictorScholzx/Sistema-Alunos.git
   cd sistema-alunos
   ```

2. **Compile e execute com Maven**
   ```bash
   mvn spring-boot:run
   ```
   Ou, se estiver no Windows:
   ```bash
   ./mvnw.cmd spring-boot:run
   ```

3. **Acesse a aplicação**
   Abra o navegador e vá para:
   ```
   http://localhost:8080/alunos
   ```

## 📂 Estrutura do Projeto

```
src/main/java/com/victor/sistemaalunos/
├── controller/          # Controladores MVC
│   └── AlunoController.java
├── model/               # Classes de modelo (entidades)
│   └── Aluno.java
├── repository/          # Repositórios (simulação de banco de dados)
│   └── AlunoRepository.java
├── service/             # Camada de serviço (lógica de negócios)
│   └── AlunoService.java
└── SistemaAlunosApplication.java  # Classe principal

src/main/resources/
├── static/css/          # Arquivos estáticos
│   └── style.css
├── templates/alunos/     # Templates Thymeleaf
│   ├── formulario.html
│   └── lista.html
└── application.properties  # Configurações do Spring Boot
```

## 📧 Contato

- **Autor:** Victor Augusto Scholz
- **Email:** victor.scholz05@icloud.com