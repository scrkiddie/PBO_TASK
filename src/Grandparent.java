class Grandparent extends Person {
    public Grandparent(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    public void getDetails() {
        System.out.println("Grandparent: " + super.getName() + " (" + super.getGender() + "), Age: " + super.getAge());
    }

}


