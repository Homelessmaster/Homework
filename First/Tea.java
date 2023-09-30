package First;

public class Tea extends Product {
    private String variety;
    private String format;

    public Tea(String brand, String name, double price, String variety, String format){
        super(brand, name, price);
        checkFormat(format);
        checkVariety(variety);
    }


    @Override
    public String displayInfo() {
        return String.format("[ЧАЙ] %s - %s - %.2f - сорт: %s; формат: %s", brand, name, price, variety, format);
    }  


    public String getVariety() {
        return variety;
    }
    public String getFormat() {
        return format;
    }
    public void setVariety(String variety) {
        checkVariety(variety);
    }
    public void setFormat(String format) {
        checkFormat(format);
    }


    private void checkFormat(String format){
        if (format == null || format.length() < 3){
            this.format = "Формат";
        }
        else {
            this.format = format;
        }
    }
    private void checkVariety(String variety){
        if (variety == null || variety.length() < 3){
            this.format = "Сорт";
        }
        else {
            this.variety = variety;
        }
    }
}
