package lotto;

import java.util.HashMap;
import java.util.List;

public class Output {

    public static void printNumberofRound(int num){
        System.out.printf("%d개를 구매했습니다.\n" , num);
    }

    public static void printLottery(List<Lotto> lotteryInstances){
        for (Lotto lotteryInstance : lotteryInstances) printOneRound(lotteryInstance.getNumbers());
    }

    public static void printOneRound(List<Integer> lotteryNumbers){

        System.out.print('[');

        for(int i = 0; i < lotteryNumbers.size(); i++){
            if(i != lotteryNumbers.size() - 1){
                System.out.printf("%d, " , lotteryNumbers.get(i));
            }else{
                System.out.printf("%d" , lotteryNumbers.get(i));
            }
        }

        System.out.println(']');
    }

    public static void printResult(HashMap<Integer, Integer> result){
        System.out.println("당첨 통계");
        System.out.println("---");
        System.out.printf("3개 일치 (5,000원) - %d개\n" , result.get(5));
        System.out.printf("4개 일치 (50,000원) - %d개\n" , result.get(4));
        System.out.printf("5개 일치 (1,500,000원) - %d개\n" , result.get(3));
        System.out.printf("5개 일치, 보너스 볼 일치 (30,000,000원) - %d개\n" , result.get(2));
        System.out.printf("6개 일치 (2,000,000,000원) - %d개\n" , result.get(1));
    }

    public static void printReturnRate(double returnRate){
        System.out.printf("총 수익률은%.1f%%입니다." , returnRate);
    }
}
