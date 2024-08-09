package com.elkynsamayoa.webapp.biblioteca.service;

import java.util.List;

import com.elkynsamayoa.webapp.biblioteca.model.Empleado;

public interface IEmpleadoService {
    public List<Empleado> listarEmpleados();

    public Empleado buscarEmpleadoPorId(Long id);

    public Empleado guardarEmpleado(Empleado empleado);

    public void eliminarEmpleado(Empleado empleado);
}
