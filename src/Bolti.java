import java.util.Scanner;

public class Bolti
{public static void main (String [] args){

    int  o1, o2, z, z1,z2,z3;

    //ввод данных
    Scanner scan = new Scanner(System.in);
    System.out.println("введите количество болтов  k1");
    int k1 = scan.nextInt();
    System.out.println("введите процент потерь болтов l1 ");
    int l1 = scan.nextInt();
    System.out.println("введите стоимость одного болта  m1");

    int m1 = scan.nextInt();
    System.out.println("введите количество гаек k2 процент потерь гаек l2 и стоимость одной гайки  m2");
    int k2 = scan.nextInt();
    int l2 = scan.nextInt();
    int m2 = scan.nextInt();

    //вычисление суммы от потерь болтов и гаек
    z1 = (k1*l1/100)*m1 ;
    z2 = (k2*l2/100)*m2 ;

    //вычисление остатков  болтов и гаек
    o1 = k1 - (k1*l1/100);
    o2 = k2 - (k2*l2/100) ;

    // вычисление суммы потерь от разницы количества болтов и гаек
    if (o1 >= o2)
        z3 = (o1-o2)*m1;
    else z3 =(o2-o1)*m2;

    //вычисление суммы потерь
    z= z1+z2+z3;

    //вывод суммы потерь
    System.out.println("сумма потерь "+ z);
}

}
