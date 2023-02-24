package fr.noais.filedropV3.configuration;

import fr.noais.filedropV3.configuration.configurationProperties.FiledropConfigurationProperties;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class FileDropConfig {
    private final FiledropConfigurationProperties properties;

    @Getter
    private File file;

    @Bean
    public void checkDirPresence() {
        System.out.println(properties.getFilesDirLocation());
        this.file = new File(properties.getFilesDirLocation());

        if (!file.exists() && !properties.isAllowedToCreateDir()) throw new RuntimeException("can't create the directory, it does not exists and the property 'filedrop.app.canCreateDir' is set to false");

        if (file.mkdirs()) {
            log.info("Created directory {}", properties.getFilesDirLocation());
        }else{
            log.info("Directory {} already exists", properties.getFilesDirLocation());
        }
    }
}
