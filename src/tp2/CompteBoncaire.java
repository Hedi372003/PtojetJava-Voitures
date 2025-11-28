package tp2;

public class CompteBoncaire {
    private long rip;
    private double solde;

        public CompteBoncaire(long rip, double solde) {
            this.rip = rip;
            this.solde = solde;
        }


        public void verser(double n) {
            if (n > 0) {
                solde += n;
                System.out.println("Montant versé : " + n);
            } else {
                System.out.println("Le montant doit être positif.");
            }
        }

        public void retirer(double n) {
            if (n > 0 && n <= solde) {
                solde -= n;
                System.out.println("Montant retiré : " + n);
            } else {
                System.out.println("erurre.");
            }
        }


        public void afficherCompte() {
            System.out.println("RIP: " + rip);
            System.out.println("Solde: " + solde);
        }

        public static void main(String[] args) {

            CompteBoncaire compte = new CompteBoncaire(4873535,250);
            compte.verser(200);
            compte.retirer(150);
            compte.afficherCompte();
        }
        }


