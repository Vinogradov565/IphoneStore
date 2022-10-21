public class Main {
    public static <prices> void main(String[] args) {
            Premises premises = new Premises();
            premises.priceStorage = 15000;
            premises.priceStore = 20000;

         IphoneShop shop = new IphoneShop();
         shop.nameShop = shop.nameShop;
         shop.addressShop = shop.addressShop;

        System.out.println(shop.nameShop);
        System.out.println(shop.addressShop);
        System.out.println();boolean salePhone;

        Discount discount = new Discount();
        IphoneTwelveLimitedColor firstIphoneTwelve = new IphoneTwelveLimitedColor();
        IphoneTwelveLimitedColor secondIphoneTwelve = new IphoneTwelveLimitedColor();
        IphoneTwelveLimitedColor threeIphoneTwelve = new IphoneTwelveLimitedColor();

        System.out.println("What colours are there Iphone twelve");

        firstIphoneTwelve.color = "Green";
        secondIphoneTwelve.color = "Blue";
        threeIphoneTwelve.color = "Red";
        firstIphoneTwelve.showColor();
        secondIphoneTwelve.showColor();
        threeIphoneTwelve.showColor();

        System.out.println("");

        System.out.println("Iphone twelve price: ");
        discount.nameOfDiscount = "January";
        discount.discountOfJune = "June";

        int iphoneTwelveGreen = 100000;
        double discountNum = discount.makeDiscount(discount.nameOfDiscount);
        double discountNumJune = discount.makeDiscount(discount.discountOfJune);
        double iphoneTwelveGreenWithDiscount = iphoneTwelveGreen * (1 - discountNum);
        double iphoneTwelveGreenWitDiscountJune = iphoneTwelveGreen * (1 - discountNumJune);

        System.out.println("Iphone twelve Green = " + iphoneTwelveGreen + ", "
                + "with distinction in January: " + (int) iphoneTwelveGreenWithDiscount + ", " +
                "with distinction in June: " + (int) iphoneTwelveGreenWitDiscountJune);

        int iphoneTwelveBlue = 120000;
        double iphoneTwelveBlueWithDiscount = iphoneTwelveBlue * (1 - discountNum);
        double iphoneTwelveBlueWitDiscountJune = iphoneTwelveBlue * (1 - discountNumJune);

        System.out.println("Iphone twelve Blue = " + iphoneTwelveBlue + ", "
                + "with distinction in January: " + (int) iphoneTwelveBlueWithDiscount + ", " +
                "with distinction in June: " + (int) iphoneTwelveBlueWitDiscountJune);

        int iphoneTwelveRed = 150000;
        double iphoneTwelveRedWithDiscount = iphoneTwelveRed * (1 - discountNum);
        double iphoneTwelveRedWitDiscountJune = iphoneTwelveRed * (1 - discountNumJune);

        System.out.println("Iphone twelve Red = " + iphoneTwelveRed + ", "
                + "with distinction in January: " + (int) iphoneTwelveRedWithDiscount + ", " +
                "with distinction in June: " + (int) iphoneTwelveRedWitDiscountJune);

        System.out.println("");

        System.out.println("Promotion for the purchase of twenty-five iPhones twenty-sixth as a gift");
        System.out.println("Not work discount");

        System.out.println("");

        Stock stock = new Stock();
        stock.kolichestvoIphonovGreen = 55;
        stock.cenaIphonovBlue = 100000;
        stock.kolichestvoIphonovBlue = 77;
        stock.cenaIphonaBlue = 120000;
        stock.kolichestvoIphonovRed =100;
        stock.cenaIphonaRed = 150000;

        double iphoneGreen = stock.cenaIphonovBlue * stock.kolichestvoIphonovGreen;


        if (stock.kolichestvoIphonovGreen < 25){
            System.out.println("Итого: " + (int) iphoneGreen + " Рублей");
        }
        else if (stock.kolichestvoIphonovGreen == 25){
            System.out.println("Итого: " + (int) iphoneGreen + " Рублей + 1 в подарок");
        }
        else if (stock.kolichestvoIphonovGreen < 50){
            System.out.println("Итого: " + (int) iphoneGreen + " Рублей + 1 в подарок");
        }
        else if (stock.kolichestvoIphonovGreen == 50){
            System.out.println("Итого: " + (int) iphoneGreen + " Рублей + 2 в подарок");
        }
        else if (stock.kolichestvoIphonovGreen < 75){
            System.out.println("Итого: " + (int) iphoneGreen + " Рублей + 2 в подарок");
        }
        else if (stock.kolichestvoIphonovGreen == 75){
            System.out.println("Итого: " + (int) iphoneGreen + " Рублей + 3 в подарок");
        }
        else if (stock.kolichestvoIphonovGreen < 100) {
            System.out.println("Итого: " + (int) iphoneGreen + " Рублей + 3 в подарок");
        }
        else if (stock.kolichestvoIphonovGreen == 100) {
            System.out.println("Итого: " + (int) iphoneGreen + " Рублей + 4 в подарок");
        }
        else if (stock.kolichestvoIphonovGreen > 100) {
            System.out.println("Продажа айфонов больше 100 запрещена правилами магазина.");
        }

        double iphoneBlue = stock.cenaIphonovBlue * stock.kolichestvoIphonovBlue;


        if (stock.kolichestvoIphonovBlue < 25){
            System.out.println("Итого: " + (int) iphoneBlue + " Рублей");
        }
        else if (stock.kolichestvoIphonovBlue == 25){
            System.out.println("Итого: " + (int) iphoneBlue + " Рублей + 1 в подарок");
        }
        else if (stock.kolichestvoIphonovBlue < 50){
            System.out.println("Итого: " + (int) iphoneBlue + " Рублей + 1 в подарок");
        }
        else if (stock.kolichestvoIphonovBlue == 50){
            System.out.println("Итого: " + (int) iphoneBlue + " Рублей + 2 в подарок");
        }
        else if (stock.kolichestvoIphonovBlue < 75){
            System.out.println("Итого: " + (int) iphoneBlue + " Рублей + 2 в подарок");
        }
        else if (stock.kolichestvoIphonovBlue == 75){
            System.out.println("Итого: " + (int) iphoneBlue + " Рублей + 3 в подарок");
        }
        else if (stock.kolichestvoIphonovBlue < 100) {
            System.out.println("Итого: " + (int) iphoneBlue + " Рублей + 3 в подарок");
        }
        else if (stock.kolichestvoIphonovBlue == 100) {
            System.out.println("Итого: " + (int) iphoneBlue + " Рублей + 4 в подарок");
        }
        else if (stock.kolichestvoIphonovBlue > 100) {
            System.out.println("Продажа айфонов больше 100 запрещена правилами магазина.");
        }

        double iphoneRed = stock.cenaIphonaRed * stock.kolichestvoIphonovRed;


        if (stock.kolichestvoIphonovRed < 25){
            System.out.println("Итого: " + (int) iphoneRed + " Рублей");
        }
        else if (stock.kolichestvoIphonovRed == 25){
            System.out.println("Итого: " + (int) iphoneRed + " Рублей + 1 в подарок");
        }
        else if (stock.kolichestvoIphonovRed < 50){
            System.out.println("Итого: " + (int) iphoneRed + " Рублей + 1 в подарок");
        }
        else if (stock.kolichestvoIphonovRed == 50){
            System.out.println("Итого: " + (int) iphoneRed + " Рублей + 2 в подарок");
        }
        else if (stock.kolichestvoIphonovRed < 75){
            System.out.println("Итого: " + (int) iphoneRed + " Рублей + 2 в подарок");
        }
        else if (stock.kolichestvoIphonovRed == 75){
            System.out.println("Итого: " + (int) iphoneRed + " Рублей + 3 в подарок");
        }
        else if (stock.kolichestvoIphonovRed < 100) {
            System.out.println("Итого: " + (int) iphoneRed + " Рублей + 3 в подарок");
        }
        else if (stock.kolichestvoIphonovRed == 100) {
            System.out.println("Итого: " + (int) iphoneRed + " Рублей + 4 в подарок");
        }
        else if (stock.kolichestvoIphonovRed > 100) {
            System.out.println("Продажа айфонов больше 100 запрещена правилами магазина.");
        }



        System.out.println();

        ProviderIphone providerIphone = new ProviderIphone();
        providerIphone.amountOfIphoneTwentyBlue = 100;
        providerIphone.amountOfIphoneTwentyGreen = 100;
        providerIphone.amountOfIphoneTwentyRed = 100;

        providerIphone.buyIphoneTwentyBlue = 50000;
        providerIphone.buyIphoneTwentyGreen = 70000;
        providerIphone.buyIphoneTwentyRed = 100000;

        long priceAllBuyedIphones = (providerIphone.buyIphoneTwentyBlue * providerIphone.amountOfIphoneTwentyBlue) +
                (providerIphone.amountOfIphoneTwentyGreen *  providerIphone.buyIphoneTwentyGreen) +
                (providerIphone.amountOfIphoneTwentyRed * providerIphone.buyIphoneTwentyRed);

        long allCash = (long) ((long) (iphoneGreen + iphoneBlue + iphoneRed)- (priceAllBuyedIphones +
                premises.priceStorage + premises.priceStore ));
        System.out.println("Цена Айфонов поставщика: " +priceAllBuyedIphones + " Рублей");
        System.out.println("Прибыль: " + allCash +" Рублей");

        Workers cashier_consultant = new Workers();
        Workers manager = new Workers();
        Workers director = new Workers();

        cashier_consultant.nameAndSurname = "Гришин Александр";
        cashier_consultant.jobTitle = "Касир-консультант";
        cashier_consultant.daySalary = 3000;
        cashier_consultant.daysOnTheWork = 16;
        cashier_consultant.countMonthlySalary();

        manager.nameAndSurname = "Алексей Ворнин";
        manager.jobTitle = "менеджер";
        manager.daySalary = 5000;
        manager.daysOnTheWork = 15;
        manager.countMonthlySalary();

        director.nameAndSurname = "Александр Виноградов";
        director.jobTitle = "директор";
        director.daySalary = 4000;
        director.daysOnTheWork = 10;
        director.countMonthlySalary();

        System.out.println(" ");
        System.out.println("Подсчёты зарплаты работников завершены ");

        Equipment equipment = new Equipment();
        equipment.amountOfComputers = 30;
        equipment.amountOfTerminal = 30;
        equipment.amountOfCash_register = 40;

        System.out.println("Количество компов " + equipment.amountOfComputers);

        System.out.println("Количество терминалов " + equipment.amountOfTerminal );
        
        System.out.println("Количесиво касс " + equipment.amountOfCash_register );



        Furniture furniture = new Furniture();
        furniture.amountOfChairs = 300;
        furniture.amountOfRacks = 100;
        furniture.amountOfStands = 122;
        furniture.amountOfTables = 30;

        System.out.println("Количество стульев " + furniture.amountOfChairs);
        System.out.println("Количество стоек " + furniture.amountOfRacks);
        System.out.println("Ккоичество стендов " + furniture.amountOfStands);
        System.out.println("Количество столов " + furniture.amountOfTables);





    }
}
