package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import java.util.Optional;

/**
 * Cấu hình AuditorAware dùng cho JPA Auditing
 */
@Configuration
public class AuditConfig {

    @Bean
    public AuditorAware<String> auditorProvider() {
        // Trong thực tế bạn sẽ lấy user từ SecurityContextHolder (Spring Security)
        // Ở giai đoạn đầu, có thể return "system" hoặc "admin"
        return () -> Optional.of("system");
    }
}