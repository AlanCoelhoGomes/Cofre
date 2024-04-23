package Uninter;

import java.util.Scanner;

public class Menu {

    private Scanner sc;
    private Cofrinho cofrinho;

    public Menu() {
        sc = new Scanner(System.in);
        cofrinho = new Cofrinho();
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

            case "1":
                exibirSubMenuAdicionarMoedas();
                exibirMenuPrincipal();
                break;
            
            case "2":
                exibirSubMenuRemoverMoedas();
                exibirMenuPrincipal();
                break;
            
            case"3":
                cofrinho.listagemMoedas();
                exibirMenuPrincipal();
                break;

            case"4":
                double valorTotalConvertido = cofrinho.valorTotalConvertido();
                String valorTotalConvertidoTextual = String.format("%.2f",valorTotalConvertido);
                valorTotalConvertidoTextual = valorTotalConvertidoTextual.replace(".",",")
                System.out.println("O valor total convertido para real ?" + valorTotalConvertidoTextual);
                exibirMenuPrincipal();
                break;

            default:
                System.out.println("Opcao invalida!");
                exibirMenuPrincipal();
                break;0

            }
    }

    private void exibirSubMenuAdicionarMoedas() {
        System.out.println("Escolha Moeda:");
        System.out.println("1 - Real:");
        System.out.println("2 - Dolar:");
        System.out.println("3 - Euro:");

        int opcaoMoeda = sc.nextInt();

        System.out.println("Digite o Valor:");

        String valorTextualMoeda = sc.next();

        valorTextualMoeda = valorTextualMoeda.replace(",", ".");
        double valorMoeda = Double.parseDouble(valorTextualMoeda);

        Moeda moeda = null

        if (opcaoMoeda ==1){
            moeda = new Real(valorMoeda);
        } else if (opcaoMoeda == 2) {

        }

    }

}
