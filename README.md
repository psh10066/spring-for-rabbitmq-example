# Spring For RabbitMQ 예제

## 테스트 전 공통

1. `docker-compose up -d` 명령어를 실행하여 RabbitMQ 구동
2. http://localhost:15672 접속하여 RabbitMQ 구동 확인
    - `RABBITMQ_DEFAULT_USER`, `RABBITMQ_DEFAULT_PASS` 정보로 로그인

## Application 실행하여 테스트

1. Application 실행
    - Application 실행 시 RabbitMQ에서 Bean 등록된 Exchange, Queue, Binding은 자동 생성된다.
2. `http/testRequests.http` 파일을 이용하여 API 요청 혹은 브라우저에서 http://localhost:8080/test 접속하여 요청
    - Message Produce 이후 Consume 메시지 콘솔 출력 확인

## 테스트 코드 실행하여 테스트

1. TestControllerTest 실행
    - Message Produce 이후 Consume 메시지 콘솔 출력 확인

## 참고 자료

- https://spring.io/guides/gs/messaging-rabbitmq
- https://docs.spring.io/spring-boot/docs/3.2.4/reference/htmlsingle/index.html#messaging.amqp