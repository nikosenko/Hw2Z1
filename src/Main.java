//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int ticketPrice = 21_676; // стоимость билета
        int costOneMile = 20; // стоимость в рублях одной бонусной мили

        int bonusMile = ticketPrice / costOneMile; //колличество бонусных миль
        System.out.print("Количество бонусных миль: ");
        System.out.print((bonusMile) + " бонусов");
    }
}