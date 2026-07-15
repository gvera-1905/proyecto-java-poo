/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import Clases.Cliente;

/**
 *
 * @author np192
 */
public class GestionCliente {
    private Cliente[] clientes;
    private int totalClientes;

    public GestionCliente() {
        clientes = new Cliente[100];
        totalClientes = 0;
        
        registrar(new Cliente("72905602", "Maria Sofia", "Lopez Ramos", "08/05/2000", "Colommbiana", "958000444", "sofia@gmail.com"));
        registrar(new Cliente("16482495", "Luis", "Rivera Marcos", "04/06/1998", "Peruano", "855222999", "luis@gmail.com"));
        registrar(new Cliente("455662255", "Ruth Isabel", "Morante Castro", "29/08/2005", "Peruana", "974410061", "isa@gmail.com"));
    }

    public Cliente buscarPorDni(String dni) {
        for (int i = 0; i < totalClientes; i++) {
            if (clientes[i].getDNI().equalsIgnoreCase(dni)) {
                return clientes[i];
            }
        }
        return null;
    }

    public boolean registrar(Cliente cliente) {
        if (totalClientes == clientes.length) return false;
        if (buscarPorDni(cliente.getDNI()) != null) return false;

        clientes[totalClientes] = cliente;
        totalClientes++;
        return true;
    }

    public boolean actualizar(Cliente cliente) {
        for (int i = 0; i < totalClientes; i++) {
            if (clientes[i].getDNI().equalsIgnoreCase(cliente.getDNI())) {
                clientes[i].setNombres(cliente.getNombres());
                clientes[i].setApellidos(cliente.getApellidos());
                clientes[i].setFechaNacimiento(cliente.getFechaNacimiento());
                clientes[i].setNacionalidad(cliente.getNacionalidad());
                clientes[i].setTelefono(cliente.getTelefono());
                clientes[i].setCorreo(cliente.getCorreo());
                return true;
            }
        }
        return false;
    }

    public boolean eliminar(String dni) {
        for (int i = 0; i < totalClientes; i++) {
            if (clientes[i].getDNI().equalsIgnoreCase(dni)) {
                for (int j = i; j < totalClientes - 1; j++) {
                    clientes[j] = clientes[j + 1];
                }
                clientes[totalClientes - 1] = null;
                totalClientes--;
                return true;
            }
        }
        return false;
    }

    public Cliente[] obtenerClientes() {
        return clientes; 
    }
    public int obtenerTotalClientes() {
        return totalClientes; 
    }
    
    

    public Cliente obtenerCliente(int index) {
        if (index >= 0 && index < totalClientes) {
            return clientes[index];
        }
        return null;
    }
    
}
