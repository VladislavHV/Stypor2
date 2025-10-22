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

## Тестирование
Запуск всех тестов:
```bash
mvn test
```

## Структура проекта
```bash
src/
├── main/
│   ├── java/com/example/websocket/
│   │   ├── controller/     # WebSocket контроллер
│   │   ├── config/        # WebSocket конфигурация  
│   │   └── service/       # Сервис отправки сообщений
│   └── resources/
│       ├── application.properties
│       └── static/        # HTML тестовая страница
└── test/                  # Unit-тесты
```

## Технологии
Spring Boot 3.5.6

Spring WebSocket

STOMP protocol

SockJS

Maven

## WebSocket Endpoints
Подключение: /ws-drone

Отправка сообщений: /app/connect

Подписка на сообщения: /topic/drone-messages

## Пример сообщений
Сообщения отправляются каждые 5 секунд:
```bash
Drone status update #1 - Time: 2025-10-23T00:00:53.642 - All systems operational
Drone status update #2 - Time: 2025-10-23T00:00:58.639 - All systems operational
```

## Разработка
Добавление нового типа сообщений

Измените метод sendScheduledMessage() в WebSocketMessageService

Обновите HTML страницу для отображения новых сообщений

Изменение интервала отправки

В WebSocketMessageService измените:
```bash
@Scheduled(fixedRate = 10000) // 10 секунд
```

## Troubleshooting
Проблема: Не приходят сообщения в браузере

Решение: Проверьте консоль браузера (F12) на наличие ошибок CORS

Проблема: Приложение не запускается

Решение: Убедитесь что порт 8081 свободен, или измените в application.properties
