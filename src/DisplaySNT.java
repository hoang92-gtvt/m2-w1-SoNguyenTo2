import java.util.Scanner;

public class DisplaySNT {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Nhập số lượng nguyên tố cần in");
        int number1= input.nextInt();
        System.out.println("Nhập số bắt đầu cho dãy số");
        int number2= input.nextInt();
        int count=0;

//        while(count < number1){
//                boolean check = true;
//                if (number2<2){
//                    check=false;
//                }else if (number2==2 || number2==3){
//                    check=true;
//                }else {
//                    for (int i = 2; i <=Math.sqrt(number2) ; i++) {
//                        if(number2%i==0){
//                            check=false;
//                            break;
//                        }
//                    }
//                }
//                if (check){
//                    System.out.println(number2);
//                    count++;
//                }
//
//                number2++;
//        }

        while(number2<100){

            checkSNT(number2);
            number2++;
        }



    }
    static void checkSNT(int number){
        boolean check = true;
        if (number<2){
            check=false;
        }else if (number==2 || number==3){
            check=true;
        }else {
            for (int i = 2; i <=Math.sqrt(number) ; i++) {
                if(number%i==0){
                    check=false;
                    break;
                }
            }
        }
        if (check){
            System.out.println(number);

        }

    }

}

