package org.example.romanNumerals;

public class RomanNumerals {

    public static String arabicToRoman(int numeroArabigo) {
        if (numeroArabigo <= 0 || numeroArabigo > 3999) {
            throw new IllegalArgumentException("El número debe estar entre 1 y 3999");
        }

        String[] valoresRomanos = {
                "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
        };
        int[] valoresArabigos = {
                1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
        };

        StringBuilder numeroRomano = new StringBuilder();
        int indice = 0;

        while (numeroArabigo > 0) {
            int repeticiones = numeroArabigo / valoresArabigos[indice];
            numeroArabigo %= valoresArabigos[indice];

            for (int i = 0; i < repeticiones; i++) {
                numeroRomano.append(valoresRomanos[indice]);
            }

            indice++;
        }

        return numeroRomano.toString();
    }

}
