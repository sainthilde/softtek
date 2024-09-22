package com.softtek.estudiantes.application.service;

import com.softtek.estudiantes.domain.port.in.EstudianteUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.softtek.estudiantes.domain.model.EstudianteModel;

import java.util.List;

@Service
@AllArgsConstructor
public class EstudianteService {

    private final EstudianteUseCase estudianteUseCase;

    public List<EstudianteModel> listEstudiantes() {
        return estudianteUseCase.listEstudiantes();
    }

    public void addEstudiantes(EstudianteModel estudianteModel) {
        estudianteUseCase.addEstudiante(estudianteModel);
    }

    public void updateEstudiantes(EstudianteModel estudianteModel) {
        estudianteUseCase.updateEstudiante(estudianteModel);
    }

    public void deleteEstudiantes(Integer id) {
        estudianteUseCase.deleteEstudiante(id);
    }
}
