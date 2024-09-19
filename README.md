

---

# Bootcamp THZN

O **Bootcamp THZN** é um projeto simples de simulação de um sistema de Bootcamp, onde desenvolvedores podem se cadastrar, fazer login e se inscrever em cursos e mentorias. Este sistema é desenvolvido em Java, utilizando conceitos de Programação Orientada a Objetos (POO) como abstração, encapsulamento, herança e polimorfismo.

## Funcionalidades

- **Cadastro de Usuários**: Novos usuários (desenvolvedores) podem se cadastrar no sistema fornecendo seu nome e email.
- **Login de Usuários**: Usuários cadastrados podem realizar login com o email fornecido.
- **Inscrição em Bootcamp**: Após fazer login, o usuário pode se inscrever em um Bootcamp e acessar uma lista de conteúdos (cursos e mentorias).
- **Progresso no Bootcamp**: Usuários podem progredir no Bootcamp, marcando conteúdos como concluídos e acumulando XP.
- **Consulta de Conteúdos**: O usuário pode visualizar conteúdos em que está inscrito, conteúdos que já concluiu e o total de XP acumulado.

## Estrutura do Projeto

O projeto segue uma estrutura simples, com classes Java organizadas da seguinte maneira:

- `Main.java`: Classe principal onde o sistema é executado. Ela gerencia o fluxo de interação com o usuário, como login, cadastro e inscrição no Bootcamp.
- `model/Bootcamp.java`: Representa o Bootcamp, que possui uma lista de cursos, mentorias e desenvolvedores inscritos.
- `model/Conteudo.java`: Classe abstrata que representa um conteúdo (curso ou mentoria) no Bootcamp.
- `model/Curso.java`: Subclasse de `Conteudo`, representando um curso, com sua carga horária.
- `model/Mentoria.java`: Subclasse de `Conteudo`, representando uma mentoria, com uma data específica.
- `model/Dev.java`: Representa um desenvolvedor, que pode se inscrever em Bootcamps, progredir e acumular XP.

## Tecnologias Utilizadas

- **Java**: Linguagem principal usada para implementar o sistema.
- **Paradigma de Programação Orientada a Objetos (POO)**: Conceitos de abstração, encapsulamento, herança e polimorfismo são aplicados no design do sistema.
