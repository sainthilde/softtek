package com.softtek.estudiantes.infrastructure.persistence.repository;


import com.softtek.estudiantes.domain.model.EstudianteModel;
import com.softtek.estudiantes.domain.port.out.EstudiantesRepositoryPort;
import com.softtek.estudiantes.infrastructure.api.mapper.MapperUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class JpaEstudiantesRepositoryAdapter implements EstudiantesRepositoryPort {

    private final JpaSampleRepository jpaSampleRepository;

    @Override
    public List<EstudianteModel> listPerfilesFilter() {
        return MapperUtil.listEntityToModel(jpaSampleRepository.findAll());
    }

    @Override
    public void addEstudiantes(EstudianteModel model) {
        jpaSampleRepository.save(MapperUtil.modelToEntity(model));
    }

    @Override
    public void updateEstudiantes(EstudianteModel model) {
        jpaSampleRepository.save(MapperUtil.modelToEntity(model));
    }

    @Override
    public void deleteEstudiantes(Integer id) {
        jpaSampleRepository.deleteById(id);
    }
}