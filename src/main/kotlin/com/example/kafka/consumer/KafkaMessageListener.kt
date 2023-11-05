package com.example.kafka.consumer

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class KafkaMessageListener {

    val log: Logger = LoggerFactory.getLogger(KafkaMessageListener::class.java)

    @KafkaListener(topics = ["lwh-demo-3"], groupId = "lwh-group")
    fun consume1(message: String){
        log.info("consumer1 consume the message {} ", message)
    }

    @KafkaListener(topics = ["lwh-demo-3"], groupId = "lwh-group")
    fun consume2(message: String){
        log.info("consumer2 consume the message {} ", message)
    }

    @KafkaListener(topics = ["lwh-demo-3"], groupId = "lwh-group")
    fun consume3(message: String){
        log.info("consumer3 consume the message {} ", message)
    }

    @KafkaListener(topics = ["lwh-demo-3"], groupId = "lwh-group")
    fun consume4(message: String){
        log.info("consumer4 consume the message {} ", message)
    }
}