package lesson13.homework;

public class MyMain {
    public static void main(String[] args) {


        try {
            boolean valid = Validation.getValidation("Tioma", "11111", "11111");
            System.out.println(valid);
        } catch (WrongLoginException e) {
            throw new RuntimeException(e.getMessage());
        } catch (WrongPasswordException e) {
            throw new RuntimeException(e.getMessage());
        }


    }
}
