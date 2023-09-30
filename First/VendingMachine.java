package First;

import java.util.List;

public class VendingMachine {


    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }


    public BottleOfMilk getBottleOfMilk(double volume, double fat){
        for (Product product : products){
            if (product instanceof BottleOfMilk){
                BottleOfMilk bottleOfMilk = (BottleOfMilk) product;
                if (bottleOfMilk.getVolume() == volume && bottleOfMilk.getFat() == fat){
                    return bottleOfMilk;
                }
            }
        }
        return null;
    }

    public BottleOfWater getBottleOfWater(double volume){
        for (Product product : products){
            if (product instanceof BottleOfWater){
                BottleOfWater bottleOfWater = (BottleOfWater) product;
                if (bottleOfWater.getVolume() == volume){
                    return bottleOfWater;
                }
            }
        }
        return null;
    }

    public Tea getTea(String variety, String format){
        for (Product product : products){
            if (product instanceof Tea){
                Tea tea = (Tea) product;
                if (tea.getFormat() == format && tea.getVariety() == variety){
                    return tea;
                }
            }
        }
        return null;
    }

    public Gum getGum(String taste){
        for(Product product : products){
            if(product instanceof Gum){
                Gum gum = (Gum) product;
                if(gum.getTaste() == taste){
                    return gum;
                }
            }
        }
        return null;
    }

}
