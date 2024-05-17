public class Main {
    public static void main(String[] args) {
        Grandparent kakek = new Grandparent("Ramadhan","pria",71);
        Grandparent nenek = new Grandparent("Siti","wanita",67);
        Parent ayah = new Parent("Rusdi", "pria", 36);
        Parent ibu = new Parent("Rosidah", "wanita", 35);
        Child anakPertama = new Child("Budi", "pria", 19, new Person[]{kakek,nenek},new Person[]{ayah,ibu});
        Child anakKedua = new Child("Rudi", "pria", 16, new Person[]{kakek,nenek},new Person[]{ayah,ibu});

        getDetails(kakek);
        getDetails(nenek);
        getDetails(ayah);
        getDetails(ibu);

        getDetails(anakPertama);
        getFamilyDetails(anakPertama);

        getDetails(anakKedua);
        getFamilyDetails(anakKedua);
    }
    static void getDetails(Person person){
        person.getDetails();
    }
    static void getFamilyDetails(Children children){
        children.getFamilyDetails();
    }

}
