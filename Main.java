public class Main {
    public static void main(String[] args){
        Diretor diretor = new Diretor("julio","1234");
        Gerente gerente = new Gerente("Renato","abcd");
        Cliente cliente = new Cliente("Augusto","xyz");

        System.out.println(diretor.autentica("1234")); // true
        System.out.println(diretor.autentica("222s")); // true
        System.out.println(diretor.autentica("233"));   // true
    }
}
