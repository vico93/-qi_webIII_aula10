package Model;

public class Pessoa {
    // Atributos
    private double altura;
    private byte sexo;
    // Acessores
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public byte getSexo() {
        return sexo;
    }
    public void setSexo(byte sexo) {
        this.sexo = sexo;
    }

    // Métodos
    public double calcularPesoIdeal(){
        if(this.sexo==1){ //Feminino
            return (62.1 * this.altura) - 44.7;
        }else if(this.sexo==2){
            return (72.7 * this.altura) - 58;
        }else{
            return 0;
        }
    }

    // toString

    @Override
    public String toString() {
        return "Altura: " + altura +
                "\nSexo: " + sexo;
    }
}
