import org.junit.Test;

public class AQTest {

    @Test
    public  void printNineNAQ1(){
        System.out.println("九九乘法表(正序) 右阶梯");
        for(int i=1; i<10; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+"*"+i+" ");
            }
            System.out.println();
        }
    }

    @Test
    public void printNineNAQ4(){
        System.out.println("九九乘法表（倒序）右阶梯");
        for(int i= 9; i>0; i--){
            for(int j = i; j > 0; j --){
                System.out.print(i+"*"+j+" ");
            }
            System.out.println();
        }
    }

    @Test
    public void printNineNAQ2(){
        System.out.println("九九乘法表（正序）左阶梯");
        for(int i= 1; i < 10; i++){
            for(int x = 1 ; x < 10-i; x++){//x参数的存在只是为了让打印格式化
                System.out.print("    ");
            }
            for(int j = i; j > 0; j --){
                System.out.print(j+"*"+i+" ");
            }
            System.out.println();
        }
    }

    @Test
    public void printNineNAQ3(){
        System.out.println("九九乘法表（倒序）左阶梯");
        for(int i= 9; i > 0; i--){
            for(int x = 1 ; x < 10-i; x ++){//x参数的存在只是为了让打印格式化
                System.out.print("    ");
            }
            for(int j = 1; j <= i; j ++){
                System.out.print(j+"*"+i+" ");
            }
            System.out.println();
        }
    }
}

