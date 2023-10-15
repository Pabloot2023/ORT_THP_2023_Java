package noNumberAttch;

import java.util.ArrayList;
import java.util.List;

public class Compania {
    private String nombre;
    private List<Area> areas = new ArrayList<>();

    public Compania(String nombre) {
        this.nombre = nombre;
    }

    public boolean agregarArea(int numero) {
        Area area = new Area(numero);
        return areas.add(area);
    }

    public boolean agregarOficina(int numeroArea, int numeroOficina) {
        Area area = buscarArea(numeroArea);
        if (area != null) {
            return area.agregarOficina(numeroOficina);
        }
        return false;
    }

    public boolean agregarEmpleado(String nombre, String apellido, int dni, int numeroArea) {
        Area area = buscarArea(numeroArea);
        if (area != null) {
            return area.agregarEmpleado(nombre, apellido, dni);
        }
        return false;
    }   

    private Area buscarArea(int numeroArea) {
        for (Area area : areas) {
            if (area.obtenerNumero() == numeroArea) {
                return area;
            }
        }
        return null; // Área no encontrada
    }

    private Oficina buscarOficina(int numeroOficina) {
        for (Area area : areas) {
            Oficina oficina = area.buscarOficina(numeroOficina);
            if (oficina != null) {
                return oficina;
            }
        }
        return null; // Oficina no encontrada
    }

    public void listarAreas() {
        for (Area area : areas) {
            System.out.println(area.toString());
        }
    }

    public void listarEmpleados() {
        System.out.println("Empleados en " + this.toString() + ":");
        for (Area area : areas) {
            area.listarEmpleados();
        }
    }

    public void existeEmpleado(int dni) {
        boolean encontrado = false;
        String mensaje = "";
        for (Area area : areas) {
            if (area.existeEmpleado(dni)) {
                encontrado = true;
            } else {
                	encontrado = false;
                }
            }
        	if(encontrado) {
        		mensaje = "Existente en el Sistema";
        	} else {
        		mensaje = "No existe en el Sistema";
        	}
        
        
        System.out.println("Empleado con DNI " + dni + ": " + mensaje);
        }
       
    
    private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private List<Area> getAreas() {
		return areas;
	}

	private void setAreas(List<Area> areas) {
		this.areas = areas;
	}

	@Override
    public String toString() {
        return nombre;
    }

	public boolean modificarEmpleado(int dni, String nuevoNombre, String nuevoApellido, int nuevoDNI) {
		String mensaje = "";
		Boolean bandera;
	    for (Area area : areas) {
	        for (Oficina oficina : area.listarOficinas()) {
	            for (Empleado empleado : oficina.listarEmpleados()) {
	                if (empleado.getDni() == dni) {
	                    // Encontramos al empleado, ahora lo modificamos
	                    empleado.setNombre(nuevoNombre);
	                    empleado.setApellido(nuevoApellido);
	                    empleado.setDni(nuevoDNI);
	                    bandera = true; // Empleado modificado con éxito
	                    
	                    if(bandera) {
	            	    	mensaje = "---------> Datos modificados con exito";
	            	    } else {
	            	    	mensaje = "---------> Datos no modificados";
	            	    }
	                    System.out.println(mensaje);
	                }
	            }
	        }
	    }
	    return false; // Empleado con el DNI especificado no encontrado
	       
	}

}