package fr.noais.filedropV3.configuration.configurationProperties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Data
@Primary
@Component
@ConfigurationProperties(prefix = "filedrop.app")
public class FiledropConfigurationProperties {
    private String filesDirLocation;
    private boolean allowedToCreateDir;
}
