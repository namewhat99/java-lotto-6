package lotto;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LotteryRound {

    private HashMap<Integer, Integer> result = new HashMap<Integer , Integer>(Map.of(1 , 0 , 2 , 0 , 3 , 0 , 4 , 0 , 5 , 0));
    private List<Integer> winningNumber;
    private int bonusNumber;

    public void startLotteryRound(){
        int numOfLottery = Input.getPurchaseAmount();
        Output.printNumberofLottery(numOfLottery);

        this.winningNumber = Input.getWinningNumbers();
        this.bonusNumber = Input.getBonusNumber();

        Lotto currentLotto = new Lotto(Randoms.pickUniqueNumbersInRange(1, 45, 6));

    }


}
