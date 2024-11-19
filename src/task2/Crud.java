package task2;

import java.util.Arrays;

public class Crud {
    private Costumer [] costumers = new Costumer[0];
    private int size;

    public Crud() {
    }

    public Crud(Costumer[] costumers) {
        this.costumers = costumers;
    }

    public void great (Costumer costumer){
        costumers = Arrays.copyOf(costumers,size+1);
        costumers [size]=costumer;
        size++;
    }
    public void addAll (Costumer [] costumers){
        for (Costumer costumer : costumers){
            great(costumer);
        }
    }
    public void getAll(){
        for (int i = 0; i < costumers.length; i++) {
            System.out.printf("""
                    name: %s
                    email: %s
                    local date: %s
                    phone number: %s
                    id: %d
                    """,costumers[i].getFirstName(),costumers[i].getEmail(),costumers[i].getLocalDate(),costumers[i].getPhoneNumber(),costumers[i].getId());
        }

    }
    public void getById(long id){
        for (int i = 0; i < costumers.length; i++) {
            if (costumers[i].getId()==id){
                System.out.printf("""
                        name : %s
                        email : %s
                        local date : %s
                        phonr number : %s
                        id : %d
                        """,costumers[i].getFirstName(),costumers[i].getEmail(),costumers[i].getLocalDate(),costumers[i].getPhoneNumber(),costumers[i].getId());
            }
        }
    }
    public void deleteById(long id){
        boolean foundCostumer = false;
        for (int i = 0; i < size; i++) {
            if (costumers[i].getId() ==id){
                foundCostumer=true;
                for (int j = i; j < size-1; j++) {
                    costumers[j] = costumers[j+1];
                }
                size--;
            }
        }
        System.out.println("deleted!");
        costumers = Arrays.copyOf(costumers,costumers.length-1);
    }
    public void updateById(long id , Costumer newCostumer){
        for (int i = 0; i < costumers.length; i++) {
            if (costumers[i].getId()==id){
                costumers[i]=newCostumer;
            }
        }
    }

}
