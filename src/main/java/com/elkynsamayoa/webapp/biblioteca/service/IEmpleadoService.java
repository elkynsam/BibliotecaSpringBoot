package com.elkynsamayoa.webapp.biblioteca.service;

import java.util.List;

import com.elkynsamayoa.webapp.biblioteca.model.Empleado;

public interface IEmpleadoService {
    public List<Empleado>listarEmpleados();

    public Boolean guardarEmpleado(Empleado empleado);

    public Empleado buscarEmpleadoPorId(Long id);

    public void eliminarEmpleado(Empleado empleado);

    public Boolean verificarDpiDuplicado(Empleado empleado);
}
