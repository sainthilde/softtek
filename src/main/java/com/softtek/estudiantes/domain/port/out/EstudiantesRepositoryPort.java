package com.softtek.estudiantes.domain.port.out;

import com.softtek.estudiantes.domain.model.EstudianteModel;

import java.util.List;



public interface EstudiantesRepositoryPort {


    List<EstudianteModel> listPerfilesFilter();

    void addEstudiantes(EstudianteModel model);

    void updateEstudiantes(EstudianteModel model);

    void deleteEstudiantes(Integer id);
}
