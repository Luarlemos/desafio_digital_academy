package com.dio.digital.academy.infra.jackson.deser;

import com.dio.digital.academy.infra.utils.JavaTimeUtils;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDate;

/**
 * @author Venilton Falvo Jr
 */
public class LocalDateDeserializer extends StdDeserializer<LocalDate> {

	private static final long serialVersionUID = -4589164298310392227L;

	public LocalDateDeserializer() {
        super(LocalDate.class);
    }

    @Override
    public LocalDate deserialize(final JsonParser parser, final DeserializationContext context) throws IOException {
        return LocalDate.parse(parser.readValueAs(String.class), JavaTimeUtils.LOCAL_DATE_FORMATTER);
    }
}
