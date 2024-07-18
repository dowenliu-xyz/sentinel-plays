package org.example.rt

import com.alibaba.cloud.sentinel.annotation.SentinelRestTemplate
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
class KtRestTemplateConfig {

    @Bean
    @SentinelRestTemplate(
        blockHandler = "bh", blockHandlerClass = KtBlockHandler::class,
        fallback = "fb", fallbackClass = KtFallbackHandler::class,
        urlCleaner = "uc", urlCleanerClass = KtUrlCleaner::class
    )
    fun ktRestTemplate(): RestTemplate {
        return RestTemplate()
    }
}