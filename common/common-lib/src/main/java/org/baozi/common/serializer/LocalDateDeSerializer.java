package org.baozi.common.serializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.baozi.common.util.TimeConvertUtil;

import java.io.IOException;
import java.time.LocalDate;

public class LocalDateDeSerializer extends JsonDeserializer<LocalDate> {

    @Override
    public LocalDate deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        return TimeConvertUtil.timestampToLocalDate(p.getValueAsLong());
    }
}
