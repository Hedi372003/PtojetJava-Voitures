package tp2;

public class Voiture {

    public String marque;
    private String matricule;
    protected int kilomtrage;
    double prix;

    public void affiche(){
        System.out.println("matricule :"+matricule);
        System.out.println("marque : "+marque);
        System.out.println("kilomtrage : "+kilomtrage);
        System.out.println("prix :"+prix);
        System.out.println("----------------");
    }

    public Voiture(String ma, int k){
        marque = ma;
        kilomtrage = k ;
    }

    public Voiture(String ma, int k, double p) {
        this(ma, k);
        prix = p;
    }
    public Voiture(String ma, String mat, int k, double prix) {
        marque = ma;
        matricule = mat;
        kilomtrage = k;
        this.prix = prix;
    }

    public Voiture (){
        marque="";
        matricule="";
        kilomtrage=0;
        prix=0;
    }

    public static void main(String[] args){
        Voiture v1=new Voiture();
        v1.marque="marcedes";
        v1.matricule="12tu120";
        v1.prix=1500000;
        v1.kilomtrage=200;
        v1.affiche();

        Voiture v2 = new Voiture("opel",5000);
        v2.matricule ="11 tu 144";
        v2.prix = 250000;
        v2.affiche();

        Voiture v3 = new Voiture("volswagen",200,70000);
        v3.matricule ="69 tu 155";
        v3.affiche();

        Voiture v4 = new Voiture("audi","14 tu 55",1200,60000);
        v4.affiche();
    }

}
