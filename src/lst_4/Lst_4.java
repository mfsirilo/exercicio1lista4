package lst_4;

import java.util.*;

public class Lst_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MetodosFila fila1 = new MetodosFila();
        MetodosFila fila2 = new MetodosFila();
        MetodosFila fila3 = new MetodosFila();
        //boolean continua = true;
        int continua = 0;
        Object elemento;
        Object prioridade;

        System.out.println("insira os valores da prioridade dos elementos");
        System.out.println("(quantidade máxima 40 prioridades)\n");
        while (continua != 5) {
            System.out.println("insira o valor do elemento");
            elemento = scan.next();
            System.out.println("");
            System.out.println("\ninsira o valor da prioridade");
            prioridade = scan.next();
            fila1.adicionar(elemento, prioridade);
            scan.nextLine();
//            System.out.println("Deseja continuar? \nS - Sim ou N - Não\n");
//            String cont = scan.nextLine();
            continua++;

//            if (cont.equals("s")) {
//                System.out.println("\nInsira novo valor");
//                continua = true;
//            } else {
//                continua = false;
//            }
        }
        System.out.println("");

        System.out.println("Insira um valor de parâmetro para divisão das filas");
        int p = scan.nextInt();
        scan.nextLine();
        System.out.println("");

        for (int i = 0; i < fila1.fim; i++) {
            if (Integer.parseInt(fila1.prioridade[i].toString()) <= p) {
                fila2.adicionar(fila1.objeto[i], fila1.prioridade[i]);
            } else {
                fila3.adicionar(fila1.objeto[i], fila1.prioridade[i]);
            }
        }
        System.out.print("fila1");
        fila2.imprimir();

        System.out.println("");
        System.out.print("fila2");
        fila3.imprimir();

    }

}
