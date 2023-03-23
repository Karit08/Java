package bytebank;

//Se extendio el Funcionario al Gerente
//Gerente hereda todas las caracteristicas de Funcionario, pero Funcionario no hereda ninguna caracteristica de Gerente
//El gerente tiene caracteristicas propias para su uso

public class Gerente extends Funcionario {

    private String clave;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    //Sobre-escritura de metodo
    @Override
    public double getBonificacion() {
		//return super.getSalario() + (super.getSalario() * 0.1);
        System.out.println("Llamando metodo del Gerente");
        return super.getBonificacion() + super.getSalario();
    }

    public boolean iniciarSesion(String clave) {
        if(this.clave == clave) {
            return true;
        } else {
            return false;
        }
    }

}
