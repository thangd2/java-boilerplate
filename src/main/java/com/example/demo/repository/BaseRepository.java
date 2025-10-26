package com.example.demo.repository;

import com.example.demo.model.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean // ✅ để Spring không tạo bean trực tiếp
public interface BaseRepository<T extends Base, ID> extends JpaRepository<T, ID> {
}