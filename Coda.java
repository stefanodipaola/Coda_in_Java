class Coda {
    private Nodo testa;
    private Nodo coda;
    private int counter;

    public Coda() {
        this.counter = 0;
        this.testa = null;
        this.coda = null;
    }

    public boolean verifica() {
        return this.counter == 0;
    }

    public void stampa()
    {
        Nodo current=this.testa;

        System.out.printf("[%d] ",this.counter);

        while (current != null) {
            System.out.printf("%d ---> ", current.valore);
            current = current.next;
        }
        System.out.printf("NULL\n");
    }

    public void aggiungi(int val)
    {
        Nodo current = new Nodo(val);

        this.counter++;

        if (this.testa == null) {
            this.testa = current;
        } else {
            this.coda.next = current;
        }

        this.coda = current;
    }

   
    public int clear()
    {
        int t;

        t = this.testa.val;

        this.testa = this.testa.next;

        if (this.testa == null) {
            this.coda = null;
        }

        this.counter--;

        return t;
    }
};