public class Vinicule{
    
    private String wineName, type;
    private int manufacYear;
    private double price;

    public Vinicule(){

    }

    public Vinicule(String wineName, String type, int manufacYear, double price){
        setWineName(wineName);
        setType(type);
        setManufacYear(manufacYear);
        setPrice(price);
    }

    //To read wine name
    public String getWineName() {
        return wineName;
    }

    //To write wine name
    public void setWineName(String wineName) {
        this.wineName = wineName;
    }

    //To read the wine type
    public String getType() {
        return type;
    }

    //To write the wine type
    public void setType(String type) {
        this.type = type;
    }

    //To read the manufacturing year
    public int getManufacYear() {
        return manufacYear;
    }

    //To write the manufacturing year
    public void setManufacYear(int manufacYear) {
        this.manufacYear = manufacYear;
    }

    //To read the price
    public double getPrice() {
        return price;
    }

    //To write the price
    public void setPrice(double price) {
        this.price = price;
    }

    public void printName() {
        System.out.println("Wine name: " + wineName);
    }

    public void Print() {
        System.out.println("\n\nWine name: " + wineName
                          + "\nType: " + type
                          + "\nManufacturing Year: " + manufacYear
                          + "\nPrice: " + price);
    }
}
