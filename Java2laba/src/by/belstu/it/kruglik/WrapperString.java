package by.belstu.it.kruglik;

public class WrapperString {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "WrapperString{}";
    }

    public WrapperString() {
    }
    public void replace(char oldchar, char newchar){

    }
    public void delete(char newchar){

    }





    public class two extends replace implements one{
        @Override
        public void delete(){
            System.out.println("ssssssssss");
        }
        @Override
        public void onee(){
            System.out.println("gggggg");
        }
    }
    public class fouth extends replace implements one{
        @Override
        public void delete(){
            System.out.println("mmmmmmmmm");
        }
        @Override
        public void onee(){
            System.out.println("iiiiiiii");
        }
    }
    public interface one{
        public void onee();
    }
    public class replace{
        public void delete(){
            System.out.println("Удалить");
        }
    }
}
