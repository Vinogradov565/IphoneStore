public class Discount {
    public String nameOfDiscount;
    public String discountOfJune;

    public double makeDiscount(String discount) {
        double discountAmount = 0;
        if(discount == "January") {
            discountAmount = 0.25;
        }
        else if (discount == "June") {
            discountAmount = 0.1;
        }
        else {
            discountAmount = 0;
        }

        return discountAmount;
    }
}
