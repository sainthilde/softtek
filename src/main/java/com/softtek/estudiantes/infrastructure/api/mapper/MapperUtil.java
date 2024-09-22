package com.softtek.estudiantes.infrastructure.api.mapper;

import com.softtek.estudiantes.domain.model.EstudianteModel;
import com.softtek.estudiantes.infrastructure.persistence.entity.EstudianteEntity;
import com.softtek.estudiantes.openapi.model.EstudianteDto;
import com.softtek.estudiantes.openapi.model.EstudiantesResponseDto;

import java.util.ArrayList;
import java.util.List;

public class MapperUtil {

    public static EstudianteModel dtoToModel(EstudianteDto estudianteDto){
        return new EstudianteModel(
                estudianteDto.getId(),
                estudianteDto.getNombre(),
                estudianteDto.getApellido(),
                estudianteDto.getEmail(),
                estudianteDto.getCreditos(),
                estudianteDto.getSemestre(),
                estudianteDto.getPromedio()
        );
    }

    public static EstudianteEntity modelToEntity(EstudianteModel model){
        return new EstudianteEntity(
                model.getId(),
                model.getNombre(),
                model.getApellido(),
                model.getEmail(),
                model.getCreditos(),
                model.getSemestre(),
                model.getPromedio()
        );
    }

    public static List<EstudianteModel> listEntityToModel (List<EstudianteEntity> estudianteEntityList) {
        List<EstudianteModel> estudianteModels = new ArrayList<>();
        estudianteEntityList.forEach(estudianteEntity ->
                estudianteModels.add(
                        new EstudianteModel(
                                estudianteEntity.getId(),
                                estudianteEntity.getNombre(),
                                estudianteEntity.getApellido(),
                                estudianteEntity.getEmail(),
                                estudianteEntity.getCreditos(),
                                estudianteEntity.getSemestre(),
                                estudianteEntity.getPromedio()
                        )
                )
        );
        return estudianteModels;
    }


    public static EstudiantesResponseDto listModelToDto (List<EstudianteModel> estudianteModelsList) {

        List<EstudianteDto> estudianteDtoList = new ArrayList<>();
        estudianteModelsList.forEach(estudianteModel ->
                estudianteDtoList.add(
                        new EstudianteDto()
                                .id(estudianteModel.getId())
                                .nombre(estudianteModel.getNombre())
                                .apellido(estudianteModel.getApellido())
                                .email(estudianteModel.getEmail())
                                .creditos(estudianteModel.getCreditos())
                                .semestre(estudianteModel.getSemestre())
                                .promedio(estudianteModel.getPromedio())
                )
        );
        return new EstudiantesResponseDto().estudiantes(estudianteDtoList);
    }

}
