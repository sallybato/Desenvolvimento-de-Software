public class Main {
    public static void main(String[] args) {

       Pessoa p = new Pessoa("0101","joão"); // inicializando o objeto pessoa(vazio)
      // p.nome = "Joao";
       // p.cpf = "010101";

       Funcionario f = new Funcionario("333", "Carlos", "algo",2.0f); // inicializando o objeto funcionario(vazio)
       f.trabalhar();


       Cliente c = new Cliente("222","Anna", "slaoq@gmail.com");// inicializando o objeto cliente(vazio)
       //c.nome = "Anna";
      // c.cpf = "3333";
       c. comprar();

       Gerente g = new Gerente( "2020", "CUZAO","fazer merda",20.0f,5);
       g.liderar();
        g.trabalhar();

        Vendedor v = new Vendedor("111", "Sebastian Carlos Yamaha",
                "vendedor", 20.0f, "Vibrador rosa tamanho G");

        v.vender();

    }
}
