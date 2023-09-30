package First;

public class Gum extends Product {
    private String taste;

    public Gum(String brand, String name, double price, String taste){
        super(brand, name, price);
        checkTaste(taste);
    }


    @Override
    public String displayInfo() {
        return String.format("[ЖВАЧКА] %s - %s - %.2f - вкус: %s", brand, name, price, taste);
    }  


    public String getTaste(){
        return taste;
    }
    public void setTaste(String taste){
        checkTaste(taste);
    }


    private void checkTaste(String taste){
        if (taste == null){
            this.taste = "вкус";
        }
        else {
            this.taste = taste;
        }
    }
}
