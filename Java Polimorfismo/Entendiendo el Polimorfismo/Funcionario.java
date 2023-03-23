package bytebank;

public class Funcionario {

    private String nombre;
    private String documento;
    protected double salario;
    //se agrega atributo para diferenciar Funcionario de Gerente
    private int tipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getBonificacion() {
        System.out.println("Llamando metodo del Funcionario");
        return this.salario * 0.1;
		//si tipo=1 es GERENTE
		//si tipo=0 es FUNCIONARIO
		//if(this.tipo == 0) {
		//	return this.salario * 0.1;
		//}else if(this.tipo == 1) {
		//	return this.salario;
		//}else {
		//	return 0;
		//}
    }

}
