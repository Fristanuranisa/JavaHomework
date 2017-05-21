package soal9;

/**
 * Created by fristanuranisa on 5/21/17.
 */
public class Animal {

    private boolean isAlive;
    public String name;
    private int age;

    public Animal(String name ,boolean isAlive, int age) {
        this.name = name;
        this.isAlive = isAlive;
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public boolean getAlive(){
        return this.isAlive;
    }


}
