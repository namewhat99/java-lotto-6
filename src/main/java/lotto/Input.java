package lotto;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;

public class Input {

    public static int getPurchaseAmount(){
        System.out.println("구입금액을 입력해 주세요.");
        return Integer.parseInt(Console.readLine()) / 100;
    }

    public static ArrayList<Integer> getWinningNumbers(){

        String[] input = Console.readLine().split(",");
        ArrayList<Integer> winningNumbers = new ArrayList<Integer>();

        for (String s : input) winningNumbers.add(Integer.parseInt(s));

        return winningNumbers;
    }

    public static int getBonusNumber(){
        return Integer.parseInt(Console.readLine());
    }


}
