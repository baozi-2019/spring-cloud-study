package org.baozi.common.serializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.baozi.common.util.TimeConvertUtil;

import java.io.IOException;
import java.time.LocalDateTime;

public class LocalDateTimeDeSerializer extends JsonDeserializer<LocalDateTime> {

    @Override
    public LocalDateTime deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        return TimeConvertUtil.timestampToLocalDateTime(p.getValueAsLong());
    }
}
