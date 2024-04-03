
public class Main {
    public static void main(String[] args) {

        UserInputReader uIR = new UserInputReader();
        try{
            User user = uIR.readUserData();
            WriterToFile wTF = new WriterToFile();
            wTF.writeUserDataToFile(user);
            System.out.println("Данные пользователя были успешно сохранены!");
        }catch (IllegalArgumentException e){
            System.out.println("Введены не корректные данные: " + e.getMessage());
        }finally {
            uIR.closeScanner();
        }

    }
}