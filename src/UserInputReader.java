import java.util.Scanner;

public class UserInputReader {
    private Scanner scanner;

    public UserInputReader() {
        this.scanner = new Scanner(System.in);
    }

    public User readUserData() throws IllegalArgumentException{
        System.out.println("Введите ваши данные (Фамилия, Имя, Отчество, дату рождения, номер телефона и пол). \n" +
                            "Все данные должны быть введены через пробел");
        String userData = scanner.nextLine();
        String[] userDataArray = userData.split(" ");

        // Проверка на корректное количество данных
        if (userDataArray.length != 6){
            throw new IllegalArgumentException("Не верное количество данных!");
        }
        // Проверка на валидность фамилии
        if (!userDataArray[0].matches("[a-zA-Z]+")){
            throw new IllegalArgumentException("Введённая фамилия не является строкой");
        }
        // Проверка на валидность имени
        if (!userDataArray[1].matches("[a-zA-Z]+")){
            throw new IllegalArgumentException("Введённое имя не является строкой");
        }
        // Проверка на валидность отчества
        if (!userDataArray[2].matches("[a-zA-Z]+")){
            throw new IllegalArgumentException("Введённое отчество не является строкой");
        }
        // Проверка на корректность даты рождения (длина строки должна быть = 10 символам)
        if ((userDataArray[3].length() != 10)){
            throw new IllegalArgumentException("Не верно введена дата рождения! Необходимо ввести дату в формате: dd.mm.yyyy");
        }
        // Проверка на валидность номера телефона (номер должен содержать только цифры и быть длиной 8 символов)
        if ((!userDataArray[4].matches("\\d{8}"))){
            throw new IllegalArgumentException("Не верно введен номер телефона! Номер телефона должен содержать 8 цифр. ");
        }
        // Проверка на корректность введённого пола (должен быть "m" или "f")
        if (!userDataArray[5].equalsIgnoreCase("m") && !userDataArray[5].equalsIgnoreCase("f")){
            throw new IllegalArgumentException("Не верно указан пол. Введите 'm' - мужской, или 'f' - женский");
        }
        // Если все данные введены правильно, то создаётся объект User и возвращаем его из метода
        return new User(userDataArray);
    }

    public void closeScanner(){
        scanner.close();
    }
}
