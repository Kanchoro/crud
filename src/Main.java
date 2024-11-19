import task1.College;
import task1.EducationCenter;
import task1.School;
import task1.University;
import task2.Costumer;
import task2.Crud;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Costumer costumer = new Costumer(1,"kana1","nur18@mail.ru",LocalDate.of(2003,10,7),"0708972805");
        Costumer costumer2 = new Costumer(2,"kana2","nur18@mail.ru",LocalDate.of(2003,10,7),"0708972805");
        Costumer costumer3 = new Costumer(3,"kana3","nur18@mail.ru",LocalDate.of(2003,10,7),"0708972805");
        Costumer costumer4 = new Costumer(4,"kana4","nur18@mail.ru",LocalDate.of(2003,10,7),"0708972805");
        Costumer costumer5 = new Costumer(5,"kana5","nur18@mail.ru",LocalDate.of(2003,10,7),"0708972805");

        Crud crud = new Crud();
        crud.addAll(new Costumer[]{costumer,costumer2,costumer3,costumer4,costumer5});
        crud.updateById(1,new Costumer(7,"mara","nur19",LocalDate.of(2003,4,2),"874385374"));
        crud.getAll();
    }
}