package io.github.purab;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.util.unit.DataSize;

import java.time.Duration;
import java.time.Period;

@ConfigurationProperties(prefix = "converted")
@ConstructorBinding
public class ConvertedProperties {
    private Duration duration;
    private Period period;
    private DataSize dataSize;
    private CustomProperty customProperty;

    public ConvertedProperties(Duration duration, Period period, DataSize dataSize, CustomProperty customProperty) {
        this.duration = duration;
        this.period = period;
        this.dataSize = dataSize;
        this.customProperty = customProperty;
    }

    public Duration getDuration() {
        return duration;
    }

    public Period getPeriod() {
        return period;
    }

    public DataSize getDataSize() {
        return dataSize;
    }

    public CustomProperty getCustomProperty() {
        return customProperty;
    }
}
