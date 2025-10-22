# **ПРОЕКТ 2: WebSocket Drone Service**

## WebSocket Drone Service

Spring Boot приложение с WebSocket сервером для real-time коммуникации с дронами.

## Функциональность

- **WebSocket сервер** на эндпоинте `/ws-drone`
- **Автоматическая отправка** сообщений каждые 5 секунд
- **STOMP протокол** с SockJS fallback
- **Тестовая HTML страница** для демонстрации
- **Unit-тесты** с полным покрытием

## Требования

- Java 17+
- Maven 3.6+

## Установка и запуск

### 1. Клонирование репозитория
```bash
git clone <repository-url>
cd websocket-drone-service
```

## Сборка и запуск приложения
```bash
mvn clean package
java -jar target/websocket-drone-service-0.0.1-SNAPSHOT.jar
```
Maven
```bash
mvn spring-boot:run
```

## Тестирование WebSocket
Открой в браузере:

http://localhost:8081/websocket-test.html

Нажми "Connect to WebSocket" и наблюдай сообщения каждые 5 секунд.


