package com.example.demo.config;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component  // 👈 Spring Boot sẽ tự chạy class này khi app khởi động
public class DataSeeder implements CommandLineRunner {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public DataSeeder(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) {
        if (userRepository.findByEmail("admin@example.com").isEmpty()) {
            User user = User.builder()
                    .email("admin@example.com")
                    .password(passwordEncoder.encode("123456")) // ✅ mã hóa mật khẩu
                    .name("Admin User")
                    .role("ADMIN")
                    .build();
            userRepository.save(user);
            System.out.println("✅ Created default admin user: admin@example.com / 123456");
        }
    }
}
