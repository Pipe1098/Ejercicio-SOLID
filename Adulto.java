package liskov;

public class Adulto extends Persona {
    private Object item;
    private String dni;

    public Adulto(String dni, String nombre, String apellidos, String tarjeta, Object item) {
        super(nombre, apellidos, tarjeta);
        this.item = item;
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }


    public void pagar() {

        System.out.println("mi dni es "+ getDni()+ " pago con la tarjeta "+super.getTarjeta());
    }
}
