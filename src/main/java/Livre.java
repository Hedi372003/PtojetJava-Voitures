package main.java;

public class Livre {
    public String libelle, auteur ;
    private double prix ;

    public Livre(String libelle) {
        this.libelle = libelle;

    }
    public Livre(String libelle ,String auteur){
        this.libelle = libelle;
        this.auteur = auteur;


    }
    public Livre(String libelle,String auteur,double prix){

        this(libelle,auteur);
        this.prix = prix;
    }
    public void affiche(){
        System.out.println(libelle);
        System.out.println(auteur);
        System.out.println(prix);

    }
    public static void main(String[] args) {
        Livre livre1 = new Livre("programmation");
        livre1.auteur="hedi";
        livre1.prix=300;
        livre1.affiche();
        Livre livre2 = new Livre("uml","fares");
        livre2.prix=400;
        livre2.affiche();
        Livre livre3 = new Livre("java","yassin",50);
        livre3.affiche();


    }

}
