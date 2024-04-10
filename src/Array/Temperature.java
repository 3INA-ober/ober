/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;

public class Temperature {

    private String[] giorni = new String[]{"Lunedi", "Martedi", "Mercoledi", "Giovedi", "Venerdi", "Sabato", "Domenica"};
    private float[] gradi = new float[7];
    private int prova;

    public Temperature() {

    }

    public float[] getGradi() {

        return gradi;
    }

    public void setGradi(float[] temp) {
        if (isValido(temp)) {
            for (int i = 0; i < gradi.length; i++) {
                this.gradi[i] = temp[i];
            }
        }
    }

    public int getProva() {
        return prova;
    }

    public void setProva(int prova) {
        this.prova = prova;
    }

    public void modificaProva() {
        prova = 100;
    }

    public boolean isValido(float[] temp) {
        boolean valido = true;

        for (int i = 0; i < gradi.length; i++) {
            if (!(gradi[i] > -90 && gradi[i] < 60)) {
                valido = false;
            }
        }

        return valido;
    }

    public boolean aggiungiTemperatura(String giorno, float temperatura) {
        boolean controllo = true;

        for (int i = 0; i < gradi.length; i++) {
            float t = gradi[i];
            if (gradi[i] == t) {
                controllo = false;
            }
        }

        return controllo;
    }

    /*
    public String tMax() {
        float tMax = gradi[0];
        String gMax = "";

        for (int i = 0; i < gradi.length; i++) {
            if (gradi[i] > tMax) {
                tMax = gradi[i];
            }
            gMax = giorni[i];

        }

        return gMax;

    }

    public String tMin() {
        float tMin = gradi[0];
        String gMin = "";

        for (int i = 0; i < gradi.length; i++) {
            if (gradi[i] < tMin) {
                tMin = gradi[i];
            }
            gMin = giorni[i];

        }

        return gMin;
    }
     */
    public float tMedia() {
        float media = 0;

        for (int i = 0; i < gradi.length; i++) {
            media += gradi[i];
        }

        media /= giorni.length;

        return media;
    }

    public String min() {
        String testo = "";
        ordinaCrescente();
        testo += giorni[0] + gradi[0];
        return testo;
    }

    public String max() {
        String testo = "";
        ordinaDecrescente();
        testo += giorni[0] + gradi[0];
        return testo;
    }

    private void ordinaCrescente() {
        String testo;
        int y;
        float temp;
        boolean scambio;
        int k = gradi.length - 1;
        do {
            scambio = false;
            for (y = 0; y < k; y++) {
                if (gradi[y] > gradi[y + 1]) {
                    temp = gradi[y];
                    gradi[y] = gradi[y + 1];
                    gradi[y + 1] = temp;
                    testo = giorni[y];
                    giorni[y] = giorni[y + 1];
                    giorni[y + 1] = testo;
                    scambio = true;
                }
            }
            k--;
        } while (scambio == true);

    }

    public void ordinaDecrescente() {
        String testo;
        int y;
        float temp;
        boolean scambio;
        int k = gradi.length - 1;
        do {
            scambio = false;
            for (y = 0; y < k; y++) {
                if (gradi[y] < gradi[y + 1]) {
                    temp = gradi[y];
                    gradi[y] = gradi[y + 1];
                    gradi[y + 1] = temp;
                    testo = giorni[y];
                    giorni[y] = giorni[y + 1];
                    giorni[y + 1] = testo;
                    scambio = true;
                }
            }
            k--;
        } while (scambio == true);

    }
}
