package io.github.purab;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class CustomPropertyConverter implements Converter<String, CustomProperty> {

    @Override
    public CustomProperty convert(String source) {
        final String[] fields = source.split(",");
        return new CustomProperty(fields[0], Boolean.valueOf(fields[1]));
    }
}
