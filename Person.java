public class Person extends Name {

    private int height;

    public void setHeight(int height) {
        if (height > 0 && height < 300) {
            this.height = height;
        }
        else {
            System.out.println("Введён недопустимый рост (установлено значение 0)");
            this.height = 0;
        }
    }

    public int getHeight() {
        return height;
    }

    public Person() {
        super(null,null,null);
        this.height = 0;
    }

    public Person(String name, int height){
        super(null,name,null);
        setHeight(height);
    }

    public Person(String surname, String name, String patronymic, int height){
        super(surname,name,patronymic);
        setHeight(height);
    }

    @Override
    public String toString() {
        return super.toString() + ", рост: " + height;
    }
}
