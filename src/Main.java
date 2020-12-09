import java.awt.*;
import java.awt.Menu;
import java.lang.constant.Constable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        StringCrypter cesar = new StringCrypter(new CesarSymbolCrypter());
        StringCrypter hor = new StringCrypter(new XorSymbolCrypter());

        System.out.println("Введите строку для работы с шифрованием ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        MenuBase encryptcesar = new EncryptMenuAction(cesar, string);
        MenuBase uncryptcesar = new UncryptMenuAction(cesar, string);
        MenuBase encrypthor = new EncryptMenuAction(hor, string);
        MenuBase uncrypthor = new UncryptMenuAction(hor, string);

        MenuBases menuBases = new MenuBases(encryptcesar, uncryptcesar, encrypthor, uncrypthor);

        while (true) {
            System.out.println("Выберите способ шифрования заданной строки :");
            menuBases.run();
            Scanner scanner1 = new Scanner(System.in);
            int indexs = scanner1.nextInt() - 1;
            menuBases.getObjects(indexs).active();
        }







    }


}









