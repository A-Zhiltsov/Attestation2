package view.consoleUI;

import model.Counter;
import model.Human_Friends;
import model.Registry;
import model.packAnimals.camel.Camel;
import model.packAnimals.donkey.Donkey;
import model.packAnimals.horse.Horse;
import model.pets.cat.Cat;
import model.pets.dog.Dog;
import model.pets.hamster.Hamster;
import view.View;

import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI implements View {
    private boolean work;
    private Registry registry = new Registry();
    private Scanner in;

    public ConsoleUI() {
        this.work = true;
    }

    @Override
    public void startWork() {
        greetings();
        in = new Scanner(System.in);
        mainMenu();
    }

    @Override
    public void finishWork() {
        work = false;
        in.close();
        goodbye();
    }
    private void greetings(){
        System.out.println("Добро пожаловать в реестр животных!");
    }

    private void goodbye(){
        System.out.println("Всего наилучшего!");
    }

    private void mainMenu(){
        while (work){
            System.out.println("Выберете номер действия:");
            System.out.println("1. Завести новое животное");
            System.out.println("2. Посмотреть список животных");
            System.out.println("3. Посмотреть количество животных");
            System.out.println("4. Закрыть программу");

            String comand = this.in.nextLine();

            if (comand.equals("1")){
                addAnimal();
            }
            else if (comand.equals("2")){
                getAnimalList();
            }
            else if (comand.equals("3")){
                System.out.printf("Количество животных - %d%n", Counter.getCount());
            }
            else if (comand.equals("4")){
                finishWork();
            }
            else {
                System.out.println("Ошибка!!Введите корректное значение");
            }
        }

    }

    private void addAnimal(){
        System.out.println("Вы заводите новое животное!");

        System.out.println("Как зовут ваше животное?");
        String name = this.in.nextLine();

        System.out.println("Дата рождения животного в формате ЧЧ.ММ.ГГГГ");
        System.out.println("Введите день");
        int day = Integer.parseInt(this.in.nextLine());
        System.out.println("Введите номер месяца");
        int month = Integer.parseInt(this.in.nextLine());
        System.out.println("Введите год");
        int year = Integer.parseInt(this.in.nextLine());
        LocalDate dob = LocalDate.of(year, month, day);

        System.out.println("Выберете вид животного");
        System.out.println("1.Кошка, 2.Собака, 3.Хомяк, 4.Лошадь, 5.Осел, 6.Верблюд");
        String choice = this.in.nextLine();

        if (choice.equals("1")){
            String ownerName;
            System.out.println("Введите имя хозяина");
            ownerName = this.in.nextLine();
            Cat cat = new Cat(name, dob, ownerName);
            {
                boolean flag = true;
                while (flag) {
                    System.out.println("Хотите обучить команде? да/нет");
                    if (this.in.nextLine().equals("да")) {
                        System.out.println("Введите команду");
                        cat.addCommand(this.in.nextLine());
                    } else if (this.in.nextLine().equals("нет")) {
                        flag = false;
                    } else {
                        System.out.println("Неверный ввод! Введите *да* или *нет*");
                    }
                }
            }
            registry.addAnimal(cat);
        }
        if (choice.equals("2")){
            String ownerName;
            System.out.println("Введите имя хозяина");
            ownerName = this.in.nextLine();
            Dog dog = new Dog(name, dob, ownerName);
            {
                boolean flag = true;
                while (flag) {
                    System.out.println("Хотите обучить команде? да/нет");
                    if (this.in.nextLine().equals("да")) {
                        System.out.println("Введите команду");
                        dog.addCommand(this.in.nextLine());
                    } else if (this.in.nextLine().equals("нет")) {
                        flag = false;
                    } else {
                        System.out.println("Неверный ввод! Введите *да* или *нет*");
                    }
                }
            }
            registry.addAnimal(dog);
        }
        if (choice.equals("3")){
            String ownerName;
            System.out.println("Введите имя хозяина");
            ownerName = this.in.nextLine();
            Hamster hamster = new Hamster(name, dob, ownerName);
            {
                boolean flag = true;
                while (flag) {
                    System.out.println("Хотите обучить команде? да/нет");
                    if (this.in.nextLine().equals("да")) {
                        System.out.println("Введите команду");
                        hamster.addCommand(this.in.nextLine());
                    } else if (this.in.nextLine().equals("нет")) {
                        flag = false;
                    } else {
                        System.out.println("Неверный ввод! Введите *да* или *нет*");
                    }
                }
            }
            registry.addAnimal(hamster);
        }
        if (choice.equals("4")){
            int portweight;
            System.out.println("Введите переносимый вес");
            portweight = Integer.parseInt(this.in.nextLine());
            Horse horse = new Horse(name, dob, portweight);
            {
                boolean flag = true;
                while (flag) {
                    System.out.println("Хотите обучить команде? да/нет");
                    if (this.in.nextLine().equals("да")) {
                        System.out.println("Введите команду");
                        horse.addCommand(this.in.nextLine());
                    } else if (this.in.nextLine().equals("нет")) {
                        flag = false;
                    } else {
                        System.out.println("Неверный ввод! Введите *да* или *нет*");
                    }
                }
            }
            registry.addAnimal(horse);
        }
        if (choice.equals("5")){
            int portweight;
            System.out.println("Введите переносимый вес");
            portweight = Integer.parseInt(this.in.nextLine());
            Donkey donkey = new Donkey(name, dob, portweight);
            {
                boolean flag = true;
                while (flag) {
                    System.out.println("Хотите обучить команде? да/нет");
                    if (this.in.nextLine().equals("да")) {
                        System.out.println("Введите команду");
                        donkey.addCommand(this.in.nextLine());
                    } else if (this.in.nextLine().equals("нет")) {
                        flag = false;
                    } else {
                        System.out.println("Неверный ввод! Введите *да* или *нет*");
                    }
                }
            }
            registry.addAnimal(donkey);
        }
        if (choice.equals("6")){
            int portweight;
            System.out.println("Введите переносимый вес");
            portweight = Integer.parseInt(this.in.nextLine());
            Camel camel = new Camel(name, dob, portweight);
            {
                boolean flag = true;
                while (flag) {
                    System.out.println("Хотите обучить команде? да/нет");
                    if (this.in.nextLine().equals("да")) {
                        System.out.println("Введите команду");
                        camel.addCommand(this.in.nextLine());
                    } else if (this.in.nextLine().equals("нет")) {
                        flag = false;
                    } else {
                        System.out.println("Неверный ввод! Введите *да* или *нет*");
                    }
                }
            }
            registry.addAnimal(camel);
        }

        Counter.add();

    }


    private void getAnimalList(){
        System.out.println("Список имеющихся животных:");
        System.out.println(registry);
    }

}
