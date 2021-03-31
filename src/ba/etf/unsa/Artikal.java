package ba.etf.unsa;

import java.util.*;

public class Artikal {
    private String sifra;
    private String naziv;
    private double cijena;
    private int length;

    public Artikal(String sifra, String naziv, double cijena) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cijena = cijena;

    }


    public static ArrayList izbaciDuplikate(ArrayList<Artikal> artikli) {
        int i=0;
        int j=0;
        for(i=0; i< artikli.size(); i++){
            for(j=i+1; j< artikli.size(); j++){
                if(artikli.get(i).equals(artikli.get(j))){
                    artikli.remove(j);
                    i--;
                }
            }
        }
        return artikli;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        if (sifra == "")
            throw new IllegalArgumentException("Sifra je prazna");
        this.sifra = sifra;

    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        if (cijena <= 0)
            throw new IllegalArgumentException("Cijena je negativna");
        this.cijena = cijena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        if (naziv == "")
            throw new IllegalArgumentException("Naziv je prazan");
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return getSifra()+ "" +getNaziv()+ "" + getCijena();

    }



}