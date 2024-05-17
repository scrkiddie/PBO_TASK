class Child extends Person implements Children {
    private Person[] parents;
    private Person[] grandParents;

    public Child(String name, String gender, int age, Person[] parents,Person[] grandParents) {
        super(name, gender, age);
        this.parents = parents;
        this.grandParents = grandParents;
    }

    @Override
    public void getDetails() {
        System.out.println("Child: " + super.getName() + " (" + super.getGender() + "), Age: " + super.getAge());
    }

    @Override
    public void getFamilyDetails() {
        for (int i=0;i<parents.length;i++){
            if(parents[i].getGender()=="wanita"){
                System.out.printf("Ibu dari %s adalah %s, dan umurnya %d tahun\n", super.getName(),parents[i].getName(), parents[i].getAge());
            }else {
                System.out.printf("Ayah dari %s adalah %s, dan umurnya %d tahun\n",super.getName(), parents[i].getName(), parents[i].getAge());
            }
        }
        for (int i=0;i<grandParents.length;i++){
            if(parents[i].getGender()=="wanita"){
                System.out.printf("Nenek dari %s adalah %s, dan umurnya %d tahun\n",super.getName(), grandParents[i].getName(), grandParents[i].getAge());
            }else {
                System.out.printf("Kakek dari %s adalah %s, dan umurnya %d tahun\n",super.getName(), grandParents[i].getName(), grandParents[i].getAge());
            }
        }

    }
}
