package ar.edu.unju.escmi.tp4.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import ar.edu.unju.escmi.tp4.collections.CollectionCliente;
import ar.edu.unju.escmi.tp4.collections.CollectionContrato;
import ar.edu.unju.escmi.tp4.collections.CollectionInmobiliaria;
import ar.edu.unju.escmi.tp4.collections.CollectionInmueble;
import ar.edu.unju.escmi.tp4.dominio.Cliente;
import ar.edu.unju.escmi.tp4.dominio.ContratoCompraVenta;
import ar.edu.unju.escmi.tp4.dominio.ContratoAlquiler;
import ar.edu.unju.escmi.tp4.dominio.Inmobiliaria;
import ar.edu.unju.escmi.tp4.dominio.Inmueble;
import ar.edu.unju.escmi.tp4.dominio.Terreno;
import ar.edu.unju.escmi.tp4.dominio.Vivienda;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcion = 0;
		
		precargarViviendas();
		precargarTerrenos();
		precargarInmobiliaria();
		precargarClientes();
		
		do {
			opcion = ingresarOpcion();
			
			switch (opcion) {
			case 1:
				registrarTerreno();
				break;
			case 2:
				registrarVivienda();
				break;
			case 3:
				registrarCliente();
				break;
			case 4:
				alquilarVivienda();
				break;
			case 5:
				venderTerreno();
				break;
			case 6:
				consultarInmueble();
				break;
			case 7:
				CollectionInmueble.consultarNoDisponibles(1); //Las viviendas NO disponibles están alquilados
				break;
			case 8:
				CollectionInmueble.consultarNoDisponibles(2); //Los terreno NO disponibles están vendidos
				break;
			case 9:
				System.out.println("*** CERRANDO PROGRAMA ***");
				scanner.close();
				break;
			default:
				System.out.println("Opción no válida");
				break;
			}
			
		} while (opcion != 9);
	}
	
	static public void precargarInmobiliaria() {
		Inmobiliaria inmobiliaria1= new Inmobiliaria("Inmobiliaria1", "+43-111-111", "Ciudad 001");
		Inmobiliaria inmobiliaria2= new Inmobiliaria("Inmobiliaria2", "+32-22-4445", "Ciudad 002");
		Inmobiliaria inmobiliaria3= new Inmobiliaria("Inmobiliaria3", "+1-1111-111", "Ciudad 003");
		
		CollectionInmobiliaria.agregarInmobiliaria(inmobiliaria1);
		CollectionInmobiliaria.agregarInmobiliaria(inmobiliaria2);
		CollectionInmobiliaria.agregarInmobiliaria(inmobiliaria3);
	}
	
	static public void precargarClientes() {
		Cliente cliente1=new Cliente("vladimir", "cachi", 12345678, "+1 111 1 11 1", "Calle 777", "vladicachi@gmail.com");
		Cliente cliente2=new Cliente("juan", "garzon", 87654321, "+22-222-222", "Calle 666", "juangarzon@gmail.com");
	
		CollectionCliente.agregarCliente(cliente1);
		CollectionCliente.agregarCliente(cliente2);
	}
	
	static public void precargarTerrenos() {
		Terreno terreno1 = new Terreno(1, 100000, true, 100.0000, 100.0000, 100);
        Terreno terreno2 = new Terreno(2, 200000, true, 200.000, 200.000, 200);
        Terreno terreno3 = new Terreno(3, 300000, true, 120.34, 12345, 150);
        
        CollectionInmueble.agregarInmueble(terreno1);
        CollectionInmueble.agregarInmueble(terreno2);
        CollectionInmueble.agregarInmueble(terreno3);
	}
	
	static public void precargarViviendas() {
		Vivienda vivienda1 = new Vivienda(11, 100, true, "Calle 111", 4);
        Vivienda vivienda2 = new Vivienda(22, 120, true, "Calle 222", 3);
        Vivienda vivienda3 = new Vivienda(33, 90, true, "Calle 333", 2);
        
        CollectionInmueble.agregarInmueble(vivienda1);
        CollectionInmueble.agregarInmueble(vivienda2);
        CollectionInmueble.agregarInmueble(vivienda3);
	}
	
	static public void menu() {
		System.out.println("\n[1] – Registrar terreno\n"
				+ "[2] – Registrar vivienda.\n"
				+ "[3] - Registrar cliente.\n"
				+ "[4] – Alquiler de vivienda\n"
				+ "[5] – Venta de terreno.\n"
				+ "[6] – Consultar Inmuebles disponibles\n"
				+ "[7] – Consultar viviendas alquiladas\n"
				+ "[8] – Consultar terrenos vendidos y monto Total\n"
				+ "[9] - Salir");
		System.out.print("Ingresar opcion: ");
	}
	
	static public int ingresarOpcion() {
		boolean opcionValida = false;
		int opcion = 0;
		while(!opcionValida) {
			try {
				menu();
				opcion = scanner.nextInt();
				opcionValida=true;
			} catch (Exception e) {
				System.out.println("ERROR: Algo falló durante la entrada de datos.");
				scanner.nextLine();
			}
		}
		scanner.nextLine();
		return opcion;
	}
	
	static public void registrarTerreno() {
		System.out.println("\n\tINGRESE LOS DATOS DEL TERRENO\n");
        System.out.print("Ingrese el id: ");
        int id = scanner.nextInt();
        System.out.print("Ingrese la latitud: ");
        double latitud = scanner.nextDouble();
        System.out.print("Ingrese la longitud: ");
        double longitud = scanner.nextDouble();
        System.out.print("Ingrese la superficie (en metros cuadrados): ");
        double superficie = scanner.nextDouble();
        System.out.print("Ingrese el precio de venta: ");
        double precio = scanner.nextDouble();
        
        boolean disponibilidad = true;

        Terreno terreno = new Terreno(id, precio, disponibilidad, latitud, longitud, superficie);
        
        CollectionInmueble.agregarInmueble(terreno);
        
        System.out.println("\n\t-- Terreno registrado correctamente --");
	}
	
	static public void registrarVivienda() {
		System.out.println("\n\tINGRESE LOS DATOS DE LA VIVIENDA\n");
		System.out.print("Ingrese el ID: ");
        int id = scanner.nextInt();
        System.out.print("Ingrese la dirección: ");
        String direccion = scanner.next();
        System.out.print("Ingrese la cantidad de habitaciones: ");
        int habitaciones = scanner.nextInt();
        System.out.print("Ingrese el precio de alquiler mensual: ");
        double precio = scanner.nextDouble();

        boolean disponibilidad = true;
        
        Vivienda vivienda = new Vivienda(id, precio, disponibilidad, direccion, habitaciones);
        
        CollectionInmueble.agregarInmueble(vivienda);
        
        System.out.println("\n\t-- Vivienda registrada correctamente --");
        
	}
	
	static public void registrarCliente() {
		System.out.println("---INGRESE LOS DATOS DEL CLIENTE---\n");
		System.out.println("Ingrese el nombre: ");
		String nombre= scanner.next();
		System.out.println("Ingrese el apellido: ");
		String apellido= scanner.next();
		System.out.println("Ingrese el dni: ");
		long dni = scanner.nextLong();
		System.out.println("Ingrese el telefono:");
		String telefono=scanner.next();
		scanner.nextLine();
		System.out.println("Ingrese la dirreccion del cliente: ");
		String direccion=scanner.nextLine();
		System.out.println("Ingrese el email: ");
		String email=scanner.next();
		
		Cliente cliente = new Cliente(nombre, apellido, dni, telefono, direccion, email);
		
		CollectionCliente.agregarCliente(cliente);
		
		System.out.println("--- ¡Se registro correctamente al cliente! ---\n");
		
	}
	
	static public void alquilarVivienda() {
		boolean flag=false;
		System.out.println("---INGRESE LOS DATOS DEL CONTRADO DE ALQUILER---\n");
		LocalDate fechaContrato=LocalDate.now();
		Cliente cliente = null;
		while(flag==false) {
			System.out.println("Ingrese el dni del cliente: ");
			long dni = scanner.nextLong();
			for(Cliente c : CollectionCliente.clientes) {
				if(c.getDni()==dni) {
					cliente=c;
					flag=true;
				}
			}
			if(flag==false) {
				System.out.println("Cliente no existente, intente de nuevo\n");
			}
			scanner.nextLine();
		}
		flag=false;
		Inmobiliaria inmobiliaria = null;
		while(flag==false) {
			System.out.println("Ingrese el nombre de la Inmobiliaria: ");
			String nombre = scanner.next();
			for(Inmobiliaria inmobiliariaIte : CollectionInmobiliaria.inmobiliarias) {
				if(inmobiliariaIte.getNombre().equals(nombre)) {
					inmobiliaria=inmobiliariaIte;
					flag=true;
				}
			}
			if(flag==false) {
				System.out.println("Inmobiliaria no existente, intente de nuevo\n");
			}
		}
		flag=false;
		Long duracion = null;
		while(flag==false) {
			System.out.println("Por cuanto tiempo desea alquilar? (Dias): ");
			duracion = scanner.nextLong();
			if(duracion<1) {
				System.out.println("Ingrese una duracion valida\n");
			}else {
				flag=true;
			}
		}
		flag=false;
		double gastosInmobiliaria = 0;
		while(flag==false) {
			System.out.println("Cuantos son los gastos de la Inmobiliaria?: ");
			gastosInmobiliaria = scanner.nextDouble();
			if(gastosInmobiliaria<0) {
				System.out.println("Ingrese un gasto valido\n");
			}else {
				flag=true;
			}
		}
		flag=false;
		Vivienda vivienda = null;
		List<Vivienda> viviendas = (List<Vivienda>) CollectionInmueble.inmuebles.stream()
                .filter(inmueble -> inmueble instanceof Vivienda) 
                .map(inmueble -> (Vivienda) inmueble)
                .filter(viv -> viv.getDisponibilidad())
                .collect(Collectors.toList());
		double precio=0;
		while(flag==false) {
			System.out.println("Ingrese el id de la vivienda: ");
			int id = scanner.nextInt();
			for(Vivienda viv : viviendas) {
				if(viv.getId()==id) {
					vivienda=viv;
					viv.setDisponibilidad(false);
					precio=vivienda.getPrecio();
					flag=true;
				}
			}
			if(flag==false) {
				System.out.println("Vivienda no existente, intente de nuevo\n");
			}
		}
		ContratoAlquiler contrato=new ContratoAlquiler(precio, fechaContrato, cliente, inmobiliaria, duracion, gastosInmobiliaria, vivienda);
		CollectionContrato.agregarContrato(contrato);
		System.out.println("Contrato Agregado con Exito\n");
		contrato.mostrarDatos();
	}
	
	static public void venderTerreno() {
	    boolean flag = false;
	    System.out.println("---INGRESE LOS DATOS DEL CONTRATO DE VENTA DE TERRENO---\n");
	    LocalDate fechaContrato = LocalDate.now();
	    Cliente cliente = null;

	    // Selección del cliente por DNI
	    while (!flag) {
	        System.out.println("Ingrese el dni del cliente: ");
	        long dni = scanner.nextLong();
	        for (Cliente c : CollectionCliente.clientes) {
	            if (c.getDni() == dni) {
	                cliente = c;
	                flag = true;
	            }
	        }
	        if (!flag) {
	            System.out.println("Cliente no existente, intente de nuevo\n");
	        }
	        scanner.nextLine();
	    }

	    // Selección de la inmobiliaria por nombre
	    flag = false;
	    Inmobiliaria inmobiliaria = null;
	    while (!flag) {
	        System.out.println("Ingrese el nombre de la Inmobiliaria: ");
	        String nombre = scanner.next();
	        for (Inmobiliaria inmobiliariaIte : CollectionInmobiliaria.inmobiliarias) {
	            if (inmobiliariaIte.getNombre().equals(nombre)) {
	                inmobiliaria = inmobiliariaIte;
	                flag = true;
	            }
	        }
	        if (!flag) {
	            System.out.println("Inmobiliaria no existente, intente de nuevo\n");
	        }
	    }

	    // Selección del terreno por ID
	    flag = false;
	    Terreno terreno = null;
	    List<Terreno> terrenos = (List<Terreno>) CollectionInmueble.inmuebles.stream()
	            .filter(inmueble -> inmueble instanceof Terreno)
	            .map(inmueble -> (Terreno) inmueble)
	            .filter(ter -> ter.getDisponibilidad())
	            .collect(Collectors.toList());

	    double precio = 0;
	    while (!flag) {
	        System.out.println("Ingrese el id del terreno: ");
	        int id = scanner.nextInt();
	        for (Terreno ter : terrenos) {
	            if (ter.getId() == id) {
	                terreno = ter;
	                ter.setDisponibilidad(false);  // Marcar el terreno como vendido
	                precio = terreno.getPrecio();
	                flag = true;
	            }
	        }
	        if (!flag) {
	            System.out.println("Terreno no existente o no disponible, intente de nuevo\n");
	        }
	    }

	    // Ingresar el impuesto y crear el contrato
	    flag=false;
		double impuesto = 0;
		while(flag==false) {
			System.out.println("Ingrese la cantidad de impuesto: ");
			impuesto = scanner.nextDouble();
			if(impuesto<0) {
				System.out.println("Ingrese un gasto valido\n");
			}else {
				flag=true;
			}
		}

	    ContratoCompraVenta contrato = new ContratoCompraVenta(impuesto, precio, fechaContrato, cliente, inmobiliaria, terreno);
	    
	    // Guardar el contrato en la colección
	    CollectionContrato.agregarContrato(contrato);

	    System.out.println("Contrato de compra de terreno agregado con éxito\n");
	    contrato.mostrarDatos();  // Método para mostrar los detalles del contrato
	}
	
	static public void consultarInmueble() {
		int opcion = 0;
		boolean esValido = false;
		while(!esValido) {
			System.out.print("\n1 - Vivienda"
								+ "\n2 - Terreno"
								+ "\nIngesar opción: ");
			opcion = scanner.nextInt();
			if(opcion == 1 || opcion == 2) esValido = true;
		}
		CollectionInmueble.consultarInmueble(opcion);
	}
	

}