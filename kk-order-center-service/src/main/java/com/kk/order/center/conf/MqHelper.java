package com.kk.order.center.conf;

import com.kk.arch.common.conf.ApplicationContextHelper;
import com.kk.arch.common.conf.TenantContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.common.message.MessageConst;
import org.springframework.boot.ApplicationRunner;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

import static com.kk.arch.common.constant.CommonConstants.TENANT_ID;

/**
 * @author Zal
 */
@Component
@Slf4j
public class MqHelper {

    public static void sendMsg(String bindingName, Object object) {
        if(Objects.isNull(object)) {
            return;
        }

        GenericJackson2JsonRedisSerializer genericJackson2JsonRedisSerializer = new GenericJackson2JsonRedisSerializer();
        byte[] bytes = genericJackson2JsonRedisSerializer.serialize(object);

        Map<String, Object> headers = new HashMap<>();
        headers.put(MessageConst.PROPERTY_KEYS, UUID.randomUUID().toString());
        headers.put(TENANT_ID, TenantContextHolder.getTenantId());

        Message<byte[]> msg = new GenericMessage<byte[]>(Objects.requireNonNull(bytes), headers);
        Objects.requireNonNull(ApplicationContextHelper.getBean(StreamBridge.class)).send(bindingName, msg);
    }

}
