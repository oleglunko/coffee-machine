# Coffee Machine

## Spring Boot, Hibernate, PostgreSQL, Maven, Swagger

### Описание проекта

Тестовое задание:

Написать программу для работы кофеварки и управляемую через браузер.
Использовать SpringFramework или SpringBoot.
Вести учет работы в PostgeSQL.
Интерфейс не нужен, запросы через Swagger UI.

Запуск базы данных: 
> docker run --name coffee_machine -p 5432:5432 -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=coffee_machine -d postgres:13.3

Документация 
> http://localhost:8080/swagger-ui/
