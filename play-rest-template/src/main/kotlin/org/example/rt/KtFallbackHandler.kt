package org.example.rt

import com.alibaba.cloud.sentinel.rest.SentinelClientHttpResponse
import com.alibaba.csp.sentinel.slots.block.BlockException
import org.springframework.http.HttpRequest
import org.springframework.http.client.ClientHttpRequestExecution
import org.springframework.http.client.ClientHttpResponse

@Suppress("UNUSED_PARAMETER")
class KtFallbackHandler {
    companion object {
        @JvmStatic
        fun fb(
            req: HttpRequest,
            body: ByteArray?,
            exec: ClientHttpRequestExecution,
            bd: BlockException
        ): ClientHttpResponse {
            return SentinelClientHttpResponse("my fallback handler from KtFallbackHandler")
        }
    }
}