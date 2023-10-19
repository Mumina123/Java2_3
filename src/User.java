public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameLengthExcepion {
        if (name.length() > 20){
            throw new IllegalNameLengthExcepion("Имя не должно быть длинее чем 20 символов");
        }
        this.name = name;
    }

    public int getAge(int age) {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 1 || age > 100){
            throw new IllegaAgeExcepion("Возраст не должен быть меньше 1 и больше 100");
        }
        this.age = age;
    }
}
