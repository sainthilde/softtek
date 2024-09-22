package com.softtek.estudiantes.domain.port.in;

import com.softtek.estudiantes.domain.model.EstudianteModel;

import java.util.List;



public interface EstudianteUseCase {

    List<EstudianteModel> listEstudiantes();

    void addEstudiante(EstudianteModel model);

    void updateEstudiante(EstudianteModel model);

    void deleteEstudiante(Integer id);
}
