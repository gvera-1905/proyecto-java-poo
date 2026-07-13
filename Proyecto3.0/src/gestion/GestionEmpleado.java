/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import Clases.Empleado;

/**
 *
 * @author np192
 */
public class GestionEmpleado {
    private Empleado[] empleados;
    private int totalEmpleados;

    public GestionEmpleado() {
        empleados = new Empleado[50];
        totalEmpleados = 0;
        
        
        registrar(new Empleado("admin", "123456", "Administrador", "89898998", "raul", "Perez"));
        registrar(new Empleado("carlos", "234567", "Asesor de Viaje", "84459225", "Carlos", "Gomez"));
        registrar(new Empleado("anna", "345678", "Operador", "455662255", "Anna", "Rivera"));
    }

    public Empleado validarLogin(String usuario, String clave) {
        for (int i = 0; i < totalEmpleados; i++) {
            if (empleados[i].getUsuario().equals(usuario) && empleados[i].getContraseña().equals(clave)) {
                return empleados[i];
            }
        }
        return null;
    }

    public Empleado buscarPorDni(String dni) {
        for (int i = 0; i < totalEmpleados; i++) {
            if (empleados[i].getDNI().equalsIgnoreCase(dni)) {
                return empleados[i];
            }
        }
        return null;
    }

    public boolean registrar(Empleado emp) {
        if (totalEmpleados == empleados.length) return false;
        if (buscarPorDni(emp.getDNI()) != null)
            return false;

        empleados[totalEmpleados] = emp;
        totalEmpleados++;
        return true;
    }

    public boolean actualizar(Empleado emp) {
        for (int i = 0; i < totalEmpleados; i++) {
            if (empleados[i].getDNI().equalsIgnoreCase(emp.getDNI())) {
                empleados[i].setNombres(emp.getNombres());
                empleados[i].setApellidos(emp.getApellidos());
                empleados[i].setUsuario(emp.getUsuario());
                empleados[i].setContraseña(emp.getContraseña());
                empleados[i].setRol(emp.getRol());
                return true;
            }
        }
        return false;
    }

    public boolean eliminar(String dni) {
        for (int i = 0; i < totalEmpleados; i++) {
            if (empleados[i].getDNI().equalsIgnoreCase(dni)) {
                for (int j = i; j < totalEmpleados - 1; j++) {
                    empleados[j] = empleados[j + 1];
                }
                empleados[totalEmpleados - 1] = null;
                totalEmpleados--;
                return true;
            }
        }
        return false;
    }

    public Empleado[] obtenerEmpleados() {
        return empleados; 
    }
    public int obtenerTotalEmpleados() {
        return totalEmpleados; 
    }
    
    
    public Empleado obtenerEmpleado(int index) {
        if (index >= 0 && index < totalEmpleados) {
            return empleados[index];
        }
        return null;
    }
}
