package liskov;

public class Main {
    public static void main(String[] args){
        Adulto adulto=new Adulto("1123","Luis","Penagos","visa","manzana");
        Nino nino=new Nino("Juan","Restrepo",adulto);
        adulto.pagar();
        nino.pagar();

    }
}
