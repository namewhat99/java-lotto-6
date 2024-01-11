package lotto;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;

public class Input {

    public static int getPurchaseAmount(){
        System.out.println("구입금액을 입력해 주세요.");
        return Integer.parseInt(Console.readLine()) / 1000;
    }

    public static ArrayList<Integer> getWinningNumbers(){
        System.out.println("당첨 번호를 입력해 주세요.");
        String[] input = Console.readLine().split(",");
        ArrayList<Integer> winningNumbers = new ArrayList<Integer>();

        for (String s : input) winningNumbers.add(Integer.parseInt(s));

        return winningNumbers;
    }

    public static int getBonusNumber(){
        System.out.println("보너스 번호를 입력해 주세요.");
        return Integer.parseInt(Console.readLine());
    }


}
