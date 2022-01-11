package aplicacao;

import imposto.CalculadoraDeImpostos;
import imposto.ICMS;
import imposto.ISS;
import orcamento.Orcamento;

import java.math.BigDecimal;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {


        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o imposto que deseja calcular");
        System.out.println("ICMS -> 1");
        System.out.println("ISS -> 2");
        int resp = sc.nextInt();

        System.out.println("Informe o orçamento: ");
        BigDecimal orc = sc.nextBigDecimal();
        Orcamento orcamento = new Orcamento(orc);

        if(resp == 1){
            System.out.println(calculadoraDeImpostos.calcular(orcamento,new ICMS()));
        }
        if(resp == 2){
            System.out.println(calculadoraDeImpostos.calcular(orcamento,new ISS()));
        }




    }
}
