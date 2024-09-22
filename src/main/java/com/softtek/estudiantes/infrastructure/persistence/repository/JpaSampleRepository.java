package com.softtek.estudiantes.infrastructure.persistence.repository;

import com.softtek.estudiantes.infrastructure.persistence.entity.EstudianteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaSampleRepository extends JpaRepository<EstudianteEntity, Integer> {
}
