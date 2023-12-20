package az.ubank.mstransfer.config;

import az.ubank.mstransfer.mapper.TransferMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public TransferMapper TransferMapper() {
        return TransferMapper.INSTANCE;
    }

}
