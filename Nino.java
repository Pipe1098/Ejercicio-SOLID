package liskov;

public class Nino extends Persona{
    private Adulto adulto;



    public Nino(String nombre, String apellidos, Adulto adulto) {
        super( nombre, apellidos, null);
        this.adulto=adulto;
    }

    @Override
    public void pagar() {
        System.out.println("El niño no puede pagar, paga el adulto");
        adulto.pagar();
    }

}
