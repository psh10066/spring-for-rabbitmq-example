package com.psh10066.example.controller;

import com.psh10066.example.dto.TestDTO;
import com.psh10066.example.rabbitmq.RabbitMQConfig;
import com.psh10066.example.rabbitmq.RabbitMQProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class TestController {

    private final RabbitMQProducer rabbitMQProducer;

    @GetMapping("/test")
    public void test() {
        log.info("test call");

        TestDTO testDTO = new TestDTO("test", 20);
        rabbitMQProducer.produce(RabbitMQConfig.EXCHANGE_NAME, RabbitMQConfig.ROUTING_KEY, testDTO);
    }
}
