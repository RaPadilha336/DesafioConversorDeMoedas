package Models;

public class MenuPrincipal {

    public void mostrarMenu(){
        System.out.println(
                """
                Bem-vindo(a) ao Conversor de Moedas
                
                *****************************************************
                1) Dólar =>> Real
                2) Real =>> Dólar
                3) Dólar =>> Euro
                4) Euro =>> Dólar
                5) Dólar =>> Libra
                6) Libra =>> Dólar
                7) Sair
                Escolha uma opção: """
        );
    }
}
