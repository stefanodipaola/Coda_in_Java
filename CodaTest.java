public class CodaTest
{
	public static void main(String[] args) {
		Coda c = new Coda();
        int t;

        System.out.printf("E' vuota ? %s\n", c.verifica() ? "Si" : "No");
        c.stampa();
        System.out.println("-------------------------------------");

        
        c.aggiungi(1);
        
        System.out.printf("E' vuota ? %s\n", c.verifica() ? "Si" : "No");
        c.stampa();
        System.out.println("-------------------------------------");

        c.aggiungi(2);
        
        System.out.printf("E' vuota ? %s\n", c.verifica() ? "Si" : "No");
        c.stampa();
        System.out.println("-------------------------------------");
        
        c.aggiungi(3);
        
        System.out.printf("E' vuota ? %s\n", c.verifica() ? "Si" : "No");
        c.stampa();
        System.out.println("-------------------------------------");

        
        if (!c.verifica()) {
            t = c.clear();
            System.out.printf("Elemento: %d\n", t);
        }
     
       System.out.printf("E' vuota ? %s\n", c.verifica() ? "Si" : "No");
        c.stampa();
        System.out.println();

       
    

	}
}