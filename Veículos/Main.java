public class Main {
    public static void main(String[] args) {

        Aviao a = new Aviao(2011, "branco","airbus",false,
                2,60.93f,"diesel turbo caralhao");
        a.ligar();
        a.decolar();
        a.pousar();
        a.desligar();

        Helicoptero h = new Helicoptero(2006,"pretao","airbus H125",true,
                4,245.50f);

            h.ligar();
            h.pairar();
            h.resgatarPessoas();
            h.desligar();

    }
}
