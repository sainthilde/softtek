package com.softtek.estudiantes.application.usecase;

import com.softtek.estudiantes.domain.model.EstudianteModel;
import com.softtek.estudiantes.domain.port.out.EstudiantesRepositoryPort;
import org.springframework.stereotype.Component;
import com.softtek.estudiantes.domain.port.in.EstudianteUseCase;

import java.util.List;

@Component
public class EstudianteUseCaseImpl implements EstudianteUseCase {

    private final EstudiantesRepositoryPort repositoryPort;

    public EstudianteUseCaseImpl(EstudiantesRepositoryPort repositoryPort) {
        this.repositoryPort = repositoryPort;
    }


    @Override
    public List<EstudianteModel> listEstudiantes() {
        return repositoryPort.listPerfilesFilter();
    }

    @Override
    public void addEstudiante(EstudianteModel model) {
        repositoryPort.addEstudiantes(model);
    }

    @Override
    public void updateEstudiante(EstudianteModel model) {
        repositoryPort.updateEstudiantes(model);
    }

    @Override
    public void deleteEstudiante(Integer id) {
        repositoryPort.deleteEstudiantes(id);
    }
}
