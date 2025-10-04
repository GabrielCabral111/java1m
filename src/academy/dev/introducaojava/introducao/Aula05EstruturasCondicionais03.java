package academy.dev.introducaojava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String possoDoar = "posso doar ";
        String naoPossoDoar = "nao posso doar ";
        String resposta ;
//        essa linha de codigo e igual a de baixo simplificado;
//        if (salario > 500){
//            resposta = possoDoar;
//        }else{
//            resposta = naoPossoDoar;
//        }
        resposta = (salario > 5000 ) ? possoDoar : naoPossoDoar;


        System.out.println(resposta);

    }
}
