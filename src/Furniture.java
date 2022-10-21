public class Furniture {
    String nameFurniture;
    int amountOfRacks;
    int amountOfTables;
    int amountOfChairs;
    int amountOfStands;

    public boolean hasFurniture(int racks, int tables, int chairs, int stands) {
        if ((racks == 0) || (tables == 0) || (chairs == 0) || (stands == 0)) {
            return false;

        }
        else {
            return true;
        }
    }
}