package lld.ATMDesign;

public class ATMRoom {
    User user;
    ATM atm;



    public static void main(String[] args) {
        ATMRoom atmRoom = new ATMRoom();
        atmRoom.initialize();

        atmRoom.atm.currentATMState();
        atmRoom.atm.getAtmState().insertCard(atmRoom.atm,atmRoom.user.card);
        atmRoom.atm.getAtmState().authenticate(atmRoom.atm,atmRoom.user.card,123);
        atmRoom.atm.getAtmState().selectOption(atmRoom.atm,atmRoom.user.card,TransactionType.CASH_WITHDRAWAL);
        atmRoom.atm.getAtmState().cashWithdraw(atmRoom.atm,atmRoom.user.card,50000);
        atmRoom.atm.currentATMState();

    }

    private void initialize() {
        atm = ATM.getCurrentATM();
        atm.setATMBalance(50000,15,20,100);
        
        this.user = createUser();

    }

    private User createUser() {
        User user = new User();
        user.setCard(createCard());
        return user;
    }

    private Card createCard() {
        Card card = new Card();
        card.setUserBankAccount(createUserBank());
        return card;
    }

    private UserBankAccount createUserBank() {
        UserBankAccount userBankAccount = new UserBankAccount();
        userBankAccount.balance = 100000;
        return userBankAccount;
    }
}
