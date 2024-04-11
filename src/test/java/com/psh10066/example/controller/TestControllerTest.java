package com.psh10066.example.controller;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.AmqpConnectException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;

@SpringBootTest
class TestControllerTest {

    @Autowired
    private TestController testController;

    @Test
    void test() throws InterruptedException {
        try {
            testController.test();
            Thread.sleep(Duration.ofSeconds(1));
        } catch (AmqpConnectException e) {
            throw new RuntimeException("RabbitMQ 연결 오류", e);
        }
        // 성공 시 console에서 Consume message 확인
    }
}