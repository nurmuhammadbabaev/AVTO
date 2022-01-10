package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {
    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson GSON = BUILDER.setPrettyPrinting().create();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int driverId;
        String state;

        AutoBase[] autoBase = {new AutoBase(1, "Renault", "Nurik", "On Base"),
                new AutoBase(2, "Volvo", "Aktan", "On Base"),
                new AutoBase(3, "DAF XT", "Elmir", "On Base")};
        Process process=new Process();
        System.out.println("Первый Этап:");
        System.out.println("Создайте все необходимые классы для хранения информации о автопарке.\nОбеспечьте необходимыи? уровень сокрытия данных и инкапсуляцию полеи?.\n" +
                "При запуске программы отобразите в консоли таблицу с данным из этого json-фаи?ла.");
        System.out.println("***************************");
        System.out.println("# |Bus\t\t|Driver\t|State");
        System.out.println("--+---------+-------+------");
        System.out.println(autoBase[0].getId() + " |" + autoBase[0].getBusName() + "\t|\t\t|" + autoBase[0].getState());
        System.out.println(autoBase[1].getId() + " |" + autoBase[1].getBusName() + "\t|\t\t|" + autoBase[1].getState());
        System.out.println(autoBase[2].getId() + " |" + autoBase[2].getBusName() + "\t|\t\t|" + autoBase[2].getState());
        System.out.println("--+---------+-------+------");
        System.out.println("***************************");
        System.out.println("Второй Этап:");
        System.out.println("После запуска программы выведите две таблички,\nв однои покажите информацию о грузовиках (как в первом этапе),\nво второи информацию о водителях. ");
        System.out.println("***************************");
        System.out.println("Первая табличка:");
        System.out.println("# |Bus\t\t|Driver");
        System.out.println("--+---------+--------");
        System.out.println(autoBase[0].getId() + " |" + autoBase[0].getBusName() + "\t|\t\t|");
        System.out.println(autoBase[1].getId() + " |" + autoBase[1].getBusName() + "\t|\t\t|");
        System.out.println(autoBase[2].getId() + " |" + autoBase[2].getBusName() + "\t|\t\t|");
        System.out.println("***************************");
        System.out.println("Вторая табличка:");
        System.out.println("# |Driver\t|Bus");
        System.out.println("--+---------+--------");
        System.out.println(autoBase[0].getId() + " |" + autoBase[0].getDriverName() + "\t|\t\t|");
        System.out.println(autoBase[1].getId() + " |" + autoBase[1].getDriverName() + "\t|\t\t|");
        System.out.println(autoBase[2].getId() + " |" + autoBase[2].getDriverName() + "\t|\t\t|");
        System.out.println("***************************");
        System.out.println("Третий Этап:");
        System.out.println("Реализуите шаблон проектирования \"состояние\" для хранения состояния грузовика. Каждыи грузовик может быть в одном из трех состоянии:\n" +
                "->  Состояние \"на базе\" - base\n" +
                "->  Состояние \"в пути\" - route\n" +
                "->  Состояние \"На ремонте\" - repair\n" +
                "С каждым грузовиком можно выполнить следующие деи?ствия (выполнить следующие методы):\n" +
                "->  Сменить водителя - changeDriver\n" +
                "->  Отправить на маршрут - startDriving\n" +
                "->  Отправить на ремонт - startRepair");
        System.out.println("***************************");
        System.out.println("В данный момент все все маршруты On Base!");
        autoBase[0].setState("On Base");
        autoBase[1].setState("On Base");
        autoBase[2].setState("On Base");
        System.out.println("# |Bus\t\t|Driver\t|State");
        System.out.println("--+---------+-------+-----");
        System.out.println(autoBase[0].getId() + " |" + autoBase[0].getBusName() + "\t|" + autoBase[0].getDriverName() + "\t|" + autoBase[0].getState());
        System.out.println(autoBase[1].getId() + " |" + autoBase[1].getBusName() + "\t|" + autoBase[1].getDriverName() + "\t|" + autoBase[1].getState());
        System.out.println(autoBase[2].getId() + " |" + autoBase[2].getBusName() + "\t|" + autoBase[2].getDriverName() + "\t|" + autoBase[2].getState());
        System.out.println("***************************");
        System.out.println("Состояние \"На базе\"\n" +
                "Когда автобус на базе, то с ним можно делать следующие действия:\n" +
                "->  Сменить водителя - changeDriver - выбрать первого свободного водителя, и назначить его на этот грузовик.\n Если у грузовика уже был водитель, то сменить его на нового. Вывести сообщение, что \"?\nТеперь грузовик <название>, ведет водитель <такои-то>?\". Если свободных водителеи нет, то выдать ошибку \"Нет свободных водителеи?\".\n" +
                "->  Отправить на маршрут - startDriving - Если у грузовика есть водитель,\n то выйти на маршрут (установить состояние route) и показать сообщение, что \"успешно вышли на маршрут\".\n" +
                "->  Отправить на ремонт - startRepair - изменить состояние на \"repair\" и показать сообщение.");
        System.out.println("***************************");
        System.out.println(process.process());



        String json = GSON.toJson(autoBase);
        write(json);
    }


    private static void write(String obj) throws IOException {
        Path wraiter=Paths.get("./autoparke.json");
        try {
            Files.writeString(wraiter, obj, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        }catch (IOException e) {
            e.printStackTrace();
        }
        }
}
