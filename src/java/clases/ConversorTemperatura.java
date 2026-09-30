package clases;

public class ConversorTemperatura {

    public double convertir(double temperatura, String conversion) {

        double resultado = 0;

        if (conversion.equals("CF")) {

            resultado = (temperatura * 9 / 5) + 32;

        } else if (conversion.equals("FC")) {

            resultado = (temperatura - 32) * 5 / 9;

        } else if (conversion.equals("CK")) {

            resultado = temperatura + 273.15;

        } else if (conversion.equals("KC")) {

            resultado = temperatura - 273.15;

        }

        return resultado;
    }
}
