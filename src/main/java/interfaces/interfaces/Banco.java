package interfaces.interfaces;

public class Banco {
    private Persona p1;
    private Persona p2;
    private Persona p3;

    public Banco(){
        p1 = new Persona();
        p1.setCuenta(1);
        p1.setNombre("Ana");
        p1.setMonto(1000);
    
        p2 = new Persona();
        p2.setCuenta(1);
        p2.setNombre("Ely");
        p2.setMonto(1000);
    
        p3 = new Persona();
        p3.setCuenta(1);
        p3.setNombre("Kary");
        p3.setMonto(1000);        

    }


    public Persona getP1() {
        return p1;
    }
    public void setP1(Persona p1) {
        this.p1 = p1;
    }
    public Persona getP2() {
        return p2;
    }
    public void setP2(Persona p2) {
        this.p2 = p2;
    }
    public Persona getP3() {
        return p3;
    }
    public void setP3(Persona p3) {
        this.p3 = p3;
    }

}
