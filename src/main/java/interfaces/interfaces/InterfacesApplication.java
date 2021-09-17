package interfaces.interfaces;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterfacesApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterfacesApplication.class, args);

		// Perro p = new Perro();
		// p.mostrarTipoDeAnimal();
		// String nombre = p.mostrarNombre();
		// System.out.println(nombre);
		// p.mostrarVida();
		Banco banco = new Banco();
		Scanner sc = new Scanner(System.in);
		System.out.println("#############################################");
		System.out.println("Bienvenidos al Banco XYZ, por favor ingrese el numero de cuenta: ");
		int cuenta = sc.nextInt();
		String operacion = "";
		switch(cuenta){
			case 1: 
			System.out.println("Bienvenido "+banco.getP1().getNombre());
			System.out.println("Ingrese la operacion a realizar: ");
			System.out.println("A. Depositar");
			System.out.println("B. Retirar");
			operacion = sc.next();
			switch(operacion){
				case "A":
				System.out.println("___________________________________________");
				System.out.println("Ingrese el monto a depositar: ");
				double montoDeposito = sc.nextDouble();
				double montoAnterior = banco.getP1().getMonto();
				double montoTotal = montoAnterior + montoDeposito;
				banco.getP1().setMonto(montoTotal);
				System.out.println("El monto final es de: "+banco.getP1().getMonto());
				break;
				case "B":
				System.out.println("___________________________________________");
				System.out.println("Ingrese el monto a retirar: ");
				double montoRetiro = sc.nextDouble();
				montoAnterior = banco.getP1().getMonto();
				montoTotal = montoAnterior - montoRetiro;
				banco.getP1().setMonto(montoTotal);
				System.out.println("El monto final es de: "+banco.getP1().getMonto());
				break;
			}
			break;
			case 2:
			System.out.println("Bienvenido "+banco.getP2().getNombre());
			System.out.println("Ingrese la operacion a realizar: ");
			System.out.println("A. Depositar");
			System.out.println("B. Retirar");
			operacion = sc.next();
			switch(operacion){
				case "A":
				System.out.println("___________________________________________");
				System.out.println("Ingrese el monto a depositar: ");
				double montoDeposito = sc.nextDouble();
				double montoAnterior = banco.getP2().getMonto();
				double montoTotal = montoAnterior + montoDeposito;
				banco.getP2().setMonto(montoTotal);
				System.out.println("El monto final es de: "+banco.getP2().getMonto());
				break;
				case "B":
				System.out.println("___________________________________________");
				System.out.println("Ingrese el monto a retirar: ");
				double montoRetiro = sc.nextDouble();
				montoAnterior = banco.getP2().getMonto();
				montoTotal = montoAnterior - montoRetiro;
				banco.getP2().setMonto(montoTotal);
				System.out.println("El monto final es de: "+banco.getP2().getMonto());
				break;
			}
			break;
			case 3:
			System.out.println("Bienvenido "+banco.getP3().getNombre());
			System.out.println("Ingrese la operacion a realizar: ");
			System.out.println("A. Depositar");
			System.out.println("B. Retirar");
			operacion = sc.next();
			switch(operacion){
				case "A":
				System.out.println("___________________________________________");
				System.out.println("Ingrese el monto a depositar: ");
				double montoDeposito = sc.nextDouble();
				double montoAnterior = banco.getP3().getMonto();
				double montoTotal = montoAnterior + montoDeposito;
				banco.getP3().setMonto(montoTotal);
				System.out.println("El monto final es de: "+banco.getP3().getMonto());
				break;
				case "B":
				System.out.println("___________________________________________");
				System.out.println("Ingrese el monto a retirar: ");
				double montoRetiro = sc.nextDouble();
				montoAnterior = banco.getP3().getMonto();
				montoTotal = montoAnterior - montoRetiro;
				banco.getP3().setMonto(montoTotal);
				System.out.println("El monto final es de: "+banco.getP3().getMonto());
				break;
			}
			break;
			default: 
			System.out.println("Cuenta no registrada");
		}
		System.out.println(banco.getP1().getMonto() + banco.getP2().getMonto() + banco.getP3().getMonto());

	}

}
