package Uninter;

import java.util.Scanner;

public class Menu {

    private Scanner sc;

    public Menu() {

    }

    public void exibirMenuPrincipal() {
        System.out.println("COFRINHO");
        System.out.println("1-Adicionar Moeda");
        System.out.println("2-Remover Moeda");
        System.out.println("3-Listar Moeda");
        System.out.println("4-Calcular valor total convertido para real");
        System.out.println("0-Encerrar");

        String opcaoSelecionada = sc.next();

        switch (opcaoSelecionada) {
            case "0":
                System.out.println("Sistema Finalizado!");
                break;
            default:
                System.out.println("Opcao invalida!");
                exibirMenuPrincipal();
                break;
        }
    }

}
