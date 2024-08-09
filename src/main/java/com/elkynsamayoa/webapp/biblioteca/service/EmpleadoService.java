package com.elkynsamayoa.webapp.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elkynsamayoa.webapp.biblioteca.model.Empleado;
import com.elkynsamayoa.webapp.biblioteca.repository.EmpleadoRepository;

@Service
public class EmpleadoService implements IEmpleadoService{

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado>listarEmpleados() {
       return empleadoRepository.findAll();
    }

    @Override
    public Empleado buscarEmpleadoPorId(Long id) {
        return empleadoRepository.findById(id).orElse(null);
    }

    @Override
    public Boolean guardarEmpleado(Empleado empleado) {
        if (!verificarDpiDuplicado(empleado)) {
            empleadoRepository.save(empleado);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {
        empleadoRepository.delete(empleado);
    }

    public Boolean verificarDpiDuplicado(Empleado empleadoNuevo){
        List<Empleado> empleados = listarEmpleados();
        Boolean flag = false;
        for (Empleado empleado : empleados) {
            if (empleado.getDpi().equals(empleadoNuevo.getDpi())&& !empleado.getId().equals(empleadoNuevo.getId())) {
                flag= true;//SI SE DUPLICO EL DPI
            }
        }
        return flag;

    }
}
