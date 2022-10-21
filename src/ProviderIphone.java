public class ProviderIphone {
    String nameOfProvider;
    int amountOfIphoneTwentyGreen;
    int amountOfIphoneTwentyBlue;
    int amountOfIphoneTwentyRed;

    int buyIphoneTwentyGreen;
    int buyIphoneTwentyBlue;
    int buyIphoneTwentyRed;

    public boolean hasProducts(int iphoneTwentyGreen, int iphoneTwentyBlue,int iphoneTwentyRed) {
        if((iphoneTwentyGreen == 0) || (iphoneTwentyBlue == 0) || (iphoneTwentyRed == 0)) {
            return false;
        }
        else {
            return true;
        }
    }
}
