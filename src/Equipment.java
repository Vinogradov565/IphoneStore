public class Equipment {
    String nameEquipment;
    int amountOfTerminal;
    int amountOfComputers;
    int amountOfCash_register;

    public boolean hasEquipment(int terminal, int computers, int cash_register) {
        if (( terminal == 0) || (computers == 0) || (cash_register == 0)) {
            return false;

        }
        else {
            return true;
        }
    }
}

