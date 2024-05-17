class Parent extends Person{
    public Parent(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    public void getDetails() {
        System.out.println("Parent: " + super.getName() + " (" + super.getGender() + "), Age: " + super.getAge());
    }

}