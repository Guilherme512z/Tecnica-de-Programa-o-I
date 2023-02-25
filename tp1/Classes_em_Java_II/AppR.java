package Classes_em_Java_II;

//  31/08/2022 data da elaboração


public class AppR {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.largura = 3;
        retangulo.altura = 4;
        System.out.println(retangulo.Area());
        System.out.println(retangulo.Perimetro());
        System.out.println(retangulo.Diagonal());
    }
}
