public class MinhaClasse {
    
public static void main (String [] args) {
    String primeiroNome = "Nyle";
    String segundoNome = "Suik";
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.printLn(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return primeiroNome.concat("").concat(segundoNome);
}

}