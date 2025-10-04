package academy.dev.introducaojava.javacore.introducao02.metodos.dominio;

public class Calculadora {
    public void somaDoisNumero(){
        System.out.println(10+10);
    }

    public void miltiplicaDoisNumeros(int num1 ,int num2){
        System.out.println(num1*num2);
    }

    public double dividirDoisNumeors(double num , double num2){
        if (num == 0 || num2 == 0 ){
            return 0;
        }
        return num / num2;
    }
    public double dividirDoisNumeors02(double num1 , double num2){
        if (num1 == 0 || num2 == 0 ){
            return 0;
        }
        return num1 / num2;
    }
    public void imprimirDuasDivisoes(int num1 , int num2){
        if (num1 == 0 || num2 == 0){
            System.out.println("Não existe Divisão por zero");
            return;
        }
        System.out.println(num1 / num2);
    }


    public void alteraDoisNumeros(int num1 , int num2){
        num1 = 99 ;
        num2 = 33 ;
        System.out.println(" num1 "+ num1);
        System.out.println(" num2 "+ num2);
    }

    public void somaArray (int [] lista ){
        int soma = 0;
        for (int i : lista  ){
            soma += i;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int i : numeros  ){
            soma += i;
        }
        System.out.println(soma);

    }

}
