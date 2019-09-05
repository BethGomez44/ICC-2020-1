public class Temperatura {
    public static int CELSIUS = 2;
    public static int FARENHEIT = 1;
    double valor;
    int escala;

    public Temperatura (double valor, int escala) {
      this.valor = valor;
      this.escala = escala;
    }

    public double convertirACelsius (double valorF) {
      return (valorF - 32) / 1.8;
    }

    public double convertirAFarenheit (double valorC) {
      return (valorC * 1.8) + 32;
    }

    public double obtenerTemperaturaEnCelsius () {
      if (escala == CELSIUS) {
        return valor;
      } else {
        return convertirACelsius(valor);
      }
    }

    public double obtenerTemperaturaEnFarenhein () {
      if (escala == FARENHEIT) {
        return valor;
      } else {
        return convertirAFarenheit(valor);
      }
    }

    public boolean esIgual (Temperatura temp) {
      return escala == temp.escala && valor == temp.valor;
    }

    public boolean esMayor (Temperatura temp) {
      return obtenerTemperaturaEnCelsius() > temp.obtenerTemperaturaEnCelsius();
    }

    public boolean esMenor (Temperatura temp) {
      return obtenerTemperaturaEnCelsius() < temp.obtenerTemperaturaEnCelsius();
    }
}
