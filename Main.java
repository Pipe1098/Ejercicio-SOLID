package liskov;

import inversionDependencia.*;
import inversionDependencia.Persona;

public class Main {
    public static void main(String[] args){
        Adulto adulto=new Adulto("1123","Luis","Penagos","visa","manzana");
        Nino nino=new Nino("Juan","Restrepo",adulto);
        adulto.pagar();
        nino.pagar();
        
Persona persona= new Persona();
        BaseDatos mysql= new MySql();
        BaseDatos oracle= new Oracle();
        servicioPersona servicioSql= new servicioPersona(mysql);
        servicioPersona servicioOracle= new servicioPersona(oracle);

        servicioSql.savePerson(persona);
        servicioOracle.savePerson(persona);
    }
}
