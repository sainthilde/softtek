package com.softtek.estudiantes.infrastructure.api.controller;

import com.softtek.estudiantes.application.service.EstudianteService;
import com.softtek.estudiantes.infrastructure.api.mapper.MapperUtil;
import com.softtek.estudiantes.openapi.api.EstudiantesApi;
import com.softtek.estudiantes.openapi.model.EstudianteDto;
import com.softtek.estudiantes.openapi.model.EstudiantesResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class EstudianteController implements EstudiantesApi {

    private final EstudianteService service;

    @Override
    public ResponseEntity<EstudiantesResponseDto> listEstudiantes() {
        return new ResponseEntity<>(MapperUtil.listModelToDto(service.listEstudiantes()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> addEstudiantes(EstudianteDto estudianteDto) {
        service.addEstudiantes(MapperUtil.dtoToModel(estudianteDto));
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<Void> updateEstudiantes(EstudianteDto estudianteDto) {
        service.updateEstudiantes(MapperUtil.dtoToModel(estudianteDto));
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<Void> deleteEstudiantes(Integer id) {
        service.deleteEstudiantes(id);
        return ResponseEntity.noContent().build();
    }
}
