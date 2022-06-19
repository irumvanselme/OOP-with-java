public class Person{
    public String first_name;
    public String last_name;
    public Person(String first_name, String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
    }

    @Override
    public boolean equals(Object o){
        Person p = (Person) o;

        if(o == null) return false;
        if(this == o) return true;
        if(this.getClass() != this.getClass()) return false;

        return p.full_name().equals(this.full_name());
    }

    @Override
    public int hashCode() {
        return this.full_name().hashCode();
    }

    public String full_name(){
        return first_name+" "+last_name;
    }
}