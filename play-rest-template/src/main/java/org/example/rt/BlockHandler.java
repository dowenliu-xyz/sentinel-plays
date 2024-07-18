package org.example.rt;

import com.alibaba.cloud.sentinel.rest.SentinelClientHttpResponse;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpResponse;

@SuppressWarnings("unused")
@Slf4j
public class BlockHandler {
    public static ClientHttpResponse bh(HttpRequest req, byte[] body, ClientHttpRequestExecution exec, BlockException be) {
        return new SentinelClientHttpResponse("my block handler from BlockHandler");
    }
}
