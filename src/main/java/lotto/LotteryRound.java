package lotto;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.*;

public class LotteryRound {

    private HashMap<Integer, Integer> result = new HashMap<Integer , Integer>(Map.of(0 , 0, 1 , 0 , 2 , 0 , 3 , 0 , 4 , 0 , 5 , 0));
    private HashMap<Integer , Integer> reward = new HashMap(Map.of(1 , 200000000 , 2 , 30000000 , 3 , 1500000 , 4 , 500000 , 5 , 50000));
    private List<Lotto> lotteryInstances = new ArrayList<Lotto>();
    private List<Integer> winningNumber;
    private int bonusNumber;
    private int round;
    private static final int LOTTERY_LENGTH = 6;

    public void startLotteryRound(){

        this.round = Input.getPurchaseAmount();
        Output.printNumberofRound(this.round);

        for(int i = 0; i < round; i++) this.createLotteryInstances();
        Output.printLottery(this.lotteryInstances);

        this.winningNumber = Input.getWinningNumbers();
        this.bonusNumber = Input.getBonusNumber();

        Collections.sort(this.winningNumber);

        for(int i = 0; i < round; i++){

            int lotResult = this.lotteryResult(this.lotteryInstances.get(i).getNumbers());
            this.result.put(lotResult, this.result.get(lotResult) + 1);
        }

        Output.printResult(this.result);
        Output.printReturnRate(this.calculateReturnRate());
    }

    public double calculateReturnRate(){
        int earn = 0;
        for(int i = 1; i <= 5; i++) earn += this.reward.get(i) * this.result.get(i);

        return (double) (earn / (1000 * this.round)) * 100;
    }

    public void createLotteryInstances(){
        this.lotteryInstances.add(new Lotto(Randoms.pickUniqueNumbersInRange(1 , 45 , 6)));
    }

    public int lotteryResult(List<Integer> lotteryNumbers){

        int winIndex = 0;
        int lotteryIndex = 0;
        int sameNumbers = 0;

        while(winIndex < LOTTERY_LENGTH && lotteryIndex < LOTTERY_LENGTH){

            if(this.winningNumber.get(winIndex) < lotteryNumbers.get(lotteryIndex)) winIndex++;
            else if(this.winningNumber.get(winIndex) > lotteryNumbers.get(lotteryIndex)) lotteryIndex++;
            else{
                winIndex++;
                lotteryIndex++;
                sameNumbers++;
            }
        }

        if(sameNumbers == 6) return 1;
        else if(sameNumbers == 5 && lotteryNumbers.contains(this.bonusNumber)) return 2;
        else if(sameNumbers == 5) return 3;
        else if(sameNumbers == 4) return 4;
        else if(sameNumbers == 3) return 5;
        else return 0;
    }


}
