package org.example.bug1442

import com.alibaba.csp.sentinel.annotation.SentinelResource
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@RestController
class MyController {
    @Value("${'$'}{service-url}")
    private var url: String? = null

    @Autowired
    private lateinit var restTemplate: RestTemplate

    @RequestMapping("/port")
    @SentinelResource(value = "port1", blockHandler = "bl")
    fun port(): Int {
        val port = restTemplate.getForObject("$url/port", Int::class.java)
        return port ?: 10086
    }

    fun bl(exception: BlockException) = 1
}