package noNumberAttch;

public class plantuml {

	public static void main(String[] args) {
		/*
		 @startuml
class Compania {
  - nombre: String
  - areas: List<Area>
  + Compania(nombre: String)
  + agregarArea(id: int): boolean
  + agregarOficina(idArea: int, numero: int): boolean
  + agregarEmpleado(nombre: String, apellido: String, dni: int, idArea: int): boolean
  + listarAreas()
  + existeEmpleado(dni: int): boolean
  + modificarEmpleado(dni: int, nuevoNombre: String, nuevoApellido: String, nuevoDNI: int): boolean
  - obtenerEmpleado(dni: int): Empleado
}

class Area {
  - id: int
  - oficinas: List<Oficina>
  + Area(id: int)
  + obtenerNumero(): int
  + agregarOficina(numero: int): boolean
  + agregarEmpleado(nombre: String, apellido: String, dni: int): boolean
  + listarOficinas(): List<Oficina>
  + existeEmpleado(dni: int): boolean
  - getId(): int
  - setId(id: int)
  - getOficinas(): List<Oficina>
  - setOficinas(oficinas: List<Oficina>)
}

class Oficina {
  - numero: int
  - empleados: List<Empleado>
  + Oficina(numero: int)
  + listarEmpleados(): List<Empleado>
  + agregarEmpleado(nombre: String, apellido: String, dni: int): boolean
  + existeEmpleado(dni: int): boolean
  - getEmpleados(): List<Empleado>
  - setEmpleados(empleados: List<Empleado>)
  - getArea(): Area
  - setArea(area: Area)
  - setNumero(numero: int)
}

class Empleado {
  - nombre: String
  - apellido: String
  - dni: int
  + Empleado(nombre: String, apellido: String, dni: int)
  + getNombre(): String
  + setNombre(nombre: String)
  + getApellido(): String
  + setApellido(apellido: String)
  + getDni(): int
  + setDni(dni: int)
}

Compania "1" -- "*" Area: contiene
Area "1" -- "*" Oficina: contiene
Oficina "0..1" -- "*" Empleado: tiene

@enduml

		 */

	}

}
