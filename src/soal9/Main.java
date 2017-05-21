package soal9;

/**
 * Created by fristanuranisa on 5/21/17.
 */
public class Main {

    public static void main(String[] args) {

        Animal hewan = new Animal("Tikus", true, 5);
        Animal kucing = new Animal("Tom", false, 7);

        System.out.println(hewan.name);
        System.out.println(hewan.getAge());
        hewan.setAge(9);
        System.out.println(hewan.getAge());
        System.out.println(kucing.name);

    }

}
