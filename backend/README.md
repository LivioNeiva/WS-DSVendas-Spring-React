# DashBoard de Vendas

Objetivos do projeto

Implementar o back end

    Modelo de domínio
    Estruturar o back end no padrão camadas
    Consulta paginada de vendas
    Consultas agrupadas para gráficos
    Implantação na nuvem

Entendendo o modelo de dados

https://github.com/LivioNeiva/WS-DSVendas-Spring-React/blob/main/dados.xlsx

Passo 1: configuração de segurança
 -COMMIT: Security config

Passo 2: criar as entidades e o seed do banco

 

Implementamos:
	
    application.properties
	Seed do banco de dados

COMMIT: Domain model, database seed

Passo 3: Estruturar o projeto em camadas
Padrão camadas adotado


    Criar repositories
    Criar DTO's
    Criar service
    Criar controller
    COMMIT: Layers

Passo 4: Busca paginada de vendas

    Pageable
    page, size, sort
    Evitando interações repetidas ao banco de dados
    COMMIT: Pagination

Passo 5: Buscas agrupadas (GROUP BY)

    Total de vendas por vendedor
    Taxa de sucesso por vendedor
    COMMIT: Group by search




