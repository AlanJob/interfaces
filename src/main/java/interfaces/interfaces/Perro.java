package interfaces.interfaces;

public class Perro implements Animal, SerVivo{

    @Override
    public String mostrarNombre() {
        // TODO Auto-generated method stub
        return "Hunter";
    }

    @Override
    public void mostrarTipoDeAnimal() {
        // TODO Auto-generated method stub
        System.out.println("Soy un mamifero, perro");
        
    }

    @Override
    public void mostrarVida() {
        // TODO Auto-generated method stub
        System.out.println("Estoy vivo");
        
    }
    
}
