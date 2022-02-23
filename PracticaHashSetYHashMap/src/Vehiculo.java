import java.util.Objects;

public class Vehiculo {
    private String matricula;
    private String modelo;
    private float cilindrada;
    private int nPuertas;

    public Vehiculo(String matricula, String modelo, float cilindrada, int nPuertas) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.nPuertas = nPuertas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehiculo vehiculo = (Vehiculo) o;

        if (Float.compare(vehiculo.cilindrada, cilindrada) != 0) return false;
        if (nPuertas != vehiculo.nPuertas) return false;
        if (!Objects.equals(matricula, vehiculo.matricula)) return false;
        return Objects.equals(modelo, vehiculo.modelo);
    }

    @Override
    public int hashCode() {
        int result = matricula != null ? matricula.hashCode() : 0;
        result = 31 * result + (modelo != null ? modelo.hashCode() : 0);
        result = 31 * result + (cilindrada != +0.0f ? Float.floatToIntBits(cilindrada) : 0);
        result = 31 * result + nPuertas;
        return result;
    }
}
