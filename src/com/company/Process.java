package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Process {
    public boolean process()throws IOException {
        Scanner scanner = new Scanner(System.in);
        int driverId;
        String state;

        AutoBase[] autoBase = {new AutoBase(1, "Renault", "Nurik", "On Base"),
                new AutoBase(2, "Volvo", "Aktan", "On Base"),
                new AutoBase(3, "DAF XT", "Elmir", "On Base")};
        while (true) {
            System.out.println("Сменить водителя? Если да то укажите \"id\" Водителя который хотите сменить! если нет то укажите цифру \"0\":");
            driverId = scanner.nextInt();
            if (driverId == 1) {
                System.out.println("Чтобы сменить первого водителя укажите его имя");
                autoBase[0].setDriverName(autoBase[0].changeDriver());
                System.out.println(autoBase[0].toString());
                System.out.println("\nПервый водитель успешно сменено!\n");
                System.out.println("# |Bus\t\t|Driver\t|State");
                System.out.println("--+---------+-------+-----");
                System.out.println(autoBase[0].toString());
                System.out.println(autoBase[1].toString());
                System.out.println(autoBase[2].toString());

            } else if (driverId == 2) {
                System.out.println("Чтобы сменить второго водителя укажите его имя");
                autoBase[1].setDriverName(autoBase[1].changeDriver());
                System.out.println(autoBase[1].toString());
                System.out.println("\nВторой водитель успешно сменено!\n");
                System.out.println("# |Bus\t\t|Driver\t|State");
                System.out.println("--+---------+-------+-----");
                System.out.println(autoBase[0].toString());
                System.out.println(autoBase[1].toString());
                System.out.println(autoBase[2].toString());
            } else if (driverId == 3) {
                System.out.println("Чтобы сменить третьего водителя укажите его имя");
                autoBase[2].setDriverName(autoBase[2].changeDriver());
                System.out.println(autoBase[2].toString());
                System.out.println("\nТретий водитель успешно сменено!\n");
                System.out.println("# |Bus\t\t|Driver\t|State");
                System.out.println("--+---------+-------+-----");
                System.out.println(autoBase[0].toString());
                System.out.println(autoBase[1].toString());
                System.out.println(autoBase[2].toString());

            } else if (driverId == 0) {
                System.out.println("\nВодитель не сменено!\n");
                System.out.println("# |Bus\t\t|Driver\t|State");
                System.out.println("--+---------+-------+-----");
                System.out.println(autoBase[0].toString());
                System.out.println(autoBase[1].toString());
                System.out.println(autoBase[2].toString());

            } else {
                throw new IOException("Не существует водителя под таким \"id\" ");
            }


            System.out.println("Хотите отправить водителя в путь? если да то укажите \"id\" водителя который хотите отправить в путь! если нет то укажите цифру \"0\"");
            driverId = scanner.nextInt();
            if (autoBase[0].getState() == "Route" && driverId == 1) {
                autoBase[0].startDriving();
                System.out.println(autoBase[0].toString());
                System.err.println("\nПервый водитель итак в пути!\n");
                System.out.println("# |Bus\t\t|Driver\t|State");
                System.out.println("--+---------+-------+-----");
                System.out.println(autoBase[0].toString());
                System.out.println(autoBase[1].toString());
                System.out.println(autoBase[2].toString());
            } else if (autoBase[1].getState() == "Route" && driverId == 2) {
                autoBase[1].startDriving();
                System.out.println(autoBase[1].toString());
                System.err.println("\nВторой водитель итак в пути!\n");
                System.out.println("# |Bus\t\t|Driver\t|State");
                System.out.println("--+---------+-------+-----");
                System.out.println(autoBase[0].toString());
                System.out.println(autoBase[1].toString());
                System.out.println(autoBase[2].toString());
            } else if (autoBase[2].getState() == "Route" && driverId == 3) {
                autoBase[2].startDriving();
                System.out.println(autoBase[2].toString());
                System.err.println("\nТретий водитель итак в пути!\n");
                System.out.println("# |Bus\t\t|Driver\t|State");
                System.out.println("--+---------+-------+-----");
                System.out.println(autoBase[0].toString());
                System.out.println(autoBase[1].toString());
                System.out.println(autoBase[2].toString());
            }else if (driverId == 1) {
                autoBase[0].startDriving();
                System.out.println(autoBase[0].toString());
                autoBase[0].setState(autoBase[0].startDriving());
                System.out.println("\nПервый водитель успешно вышел на маршрут!\n");
                System.out.println("# |Bus\t\t|Driver\t|State");
                System.out.println("--+---------+-------+-----");
                System.out.println(autoBase[0].toString());
                System.out.println(autoBase[1].toString());
                System.out.println(autoBase[2].toString());

            } else if (driverId == 2) {
                autoBase[1].startDriving();
                System.out.println(autoBase[1].toString());
                autoBase[1].setState(autoBase[1].startDriving());
                System.out.println("\nВторой водитель успешно вышел на маршрут!\n");
                System.out.println("# |Bus\t\t|Driver\t|State");
                System.out.println("--+---------+-------+-----");
                System.out.println(autoBase[0].toString());
                System.out.println(autoBase[1].toString());
                System.out.println(autoBase[2].toString());

            } else if (driverId == 3) {
                autoBase[2].startDriving();
                System.out.println(autoBase[2].toString());
                autoBase[2].setState(autoBase[2].startDriving());
                System.out.println("\nТретий водитель успешно вышел на маршрут!\n");
                System.out.println("# |Bus\t\t|Driver\t|State");
                System.out.println("--+---------+-------+-----");
                System.out.println(autoBase[0].toString());
                System.out.println(autoBase[1].toString());
                System.out.println(autoBase[2].toString());

            } else if (driverId == 0) {
                System.out.println("\nВодители не вышли на маршрут!\n");
                System.out.println("# |Bus\t\t|Driver\t|State");
                System.out.println("--+---------+-------+-----");
                System.out.println(autoBase[0].toString());
                System.out.println(autoBase[1].toString());
                System.out.println(autoBase[2].toString());

            } else {
                System.err.println("Не существует водителя под таким \"id\" ");
            }
            System.out.println("Хотите отправить грузовика на ремонт? если да то укажите \"id\" грузовика который хотите отправить на ремонт! если нет то укажите цифру \"0\"");
            driverId = scanner.nextInt();
            if (autoBase[0].getState() == "Repair" && driverId == 1) {
                autoBase[0].startRepair();
                System.out.println(autoBase[0].toString());
                System.err.println("\nПервый водитель итак на ремонте!\n");
                System.out.println("# |Bus\t\t|Driver\t|State");
                System.out.println("--+---------+-------+-----");
                System.out.println(autoBase[0].toString());
                System.out.println(autoBase[1].toString());
                System.out.println(autoBase[2].toString());
            } else if (autoBase[1].getState() == "Repair" && driverId == 2) {
                autoBase[1].startRepair();
                System.out.println(autoBase[1].toString());
                System.err.println("\nВторой водитель итак на ремонте!\n");
                System.out.println("# |Bus\t\t|Driver\t|State");
                System.out.println("--+---------+-------+-----");
                System.out.println(autoBase[0].toString());
                System.out.println(autoBase[1].toString());
                System.out.println(autoBase[2].toString());
            } else if (autoBase[2].getState() == "Repair" && driverId == 3) {
                autoBase[2].startRepair();
                System.out.println(autoBase[2].toString());
                System.err.println("\nТретий водитель итак на ремонте!\n");
                System.out.println("# |Bus\t\t|Driver\t|State");
                System.out.println("--+---------+-------+-----");
                System.out.println(autoBase[0].toString());
                System.out.println(autoBase[1].toString());
                System.out.println(autoBase[2].toString());
            }else if (driverId == 1) {
                autoBase[0].startRepair();
                System.out.println(autoBase[0].toString());
                autoBase[0].setState(autoBase[0].startRepair());
                System.out.println("\nПервый водитель успешно вышел на ремонт!\n");
                System.out.println("# |Bus\t\t|Driver\t|State");
                System.out.println("--+---------+-------+-----");
                System.out.println(autoBase[0].toString());
                System.out.println(autoBase[1].toString());
                System.out.println(autoBase[2].toString());

            } else if (driverId == 2) {
                autoBase[1].startRepair();
                System.out.println(autoBase[1].toString());
                autoBase[1].setState(autoBase[1].startRepair());
                System.out.println("\nВторой водитель успешно вышел на ремонтт!\n");
                System.out.println("# |Bus\t\t|Driver\t|State");
                System.out.println("--+---------+-------+-----");
                System.out.println(autoBase[0].toString());
                System.out.println(autoBase[1].toString());
                System.out.println(autoBase[2].toString());

            } else if (driverId == 3) {
                autoBase[2].startRepair();
                System.out.println(autoBase[2].toString());
                autoBase[2].setState(autoBase[2].startRepair());
                System.out.println("\nТретий водитель успешно вышел на ремонт!\n");
                System.out.println("# |Bus\t\t|Driver\t|State");
                System.out.println("--+---------+-------+-----");
                System.out.println(autoBase[0].toString());
                System.out.println(autoBase[1].toString());
                System.out.println(autoBase[2].toString());

            } else if (driverId == 0) {
                System.out.println("Грузовики не вышли на ремонт!");
                System.out.println("# |Bus\t\t|Driver\t|State");
                System.out.println("--+---------+-------+-----");
                System.out.println(autoBase[0].toString());
                System.out.println(autoBase[1].toString());
                System.out.println(autoBase[2].toString());

            } else {
                System.err.println("Не существует водителя под таким \"id\" ");

            }
            System.out.println("***************************");
            System.out.println("Хотите вернуть грузовика на базу? если да то укажите \"id\" грузовика который хотите вернуть на базу!");
            driverId = scanner.nextInt();
            if (autoBase[0].getState() == "On Base" && driverId == 1) {
                autoBase[0].backToBase();
                System.out.println(autoBase[0].toString());
                System.err.println("\nПервый водитель итак в базе!\n");
                System.out.println("# |Bus\t\t|Driver\t|State");
                System.out.println("--+---------+-------+-----");
                System.out.println(autoBase[0].toString());
                System.out.println(autoBase[1].toString());
                System.out.println(autoBase[2].toString());
            } else if (autoBase[1].getState() == "On Base" && driverId == 2) {
                autoBase[1].backToBase();
                System.out.println(autoBase[1].toString());
                System.err.println("\nВторойй водитель итак в базе!\n");
                System.out.println("# |Bus\t\t|Driver\t|State");
                System.out.println("--+---------+-------+-----");
                System.out.println(autoBase[0].toString());
                System.out.println(autoBase[1].toString());
                System.out.println(autoBase[2].toString());
            } else if (autoBase[2].getState() == "On Base" && driverId == 3) {
                autoBase[2].backToBase();
                System.out.println(autoBase[2].toString());
                System.err.println("\nТретий водитель итак в базе!\n");
                System.out.println("# |Bus\t\t|Driver\t|State");
                System.out.println("--+---------+-------+-----");
                System.out.println(autoBase[0].toString());
                System.out.println(autoBase[1].toString());
                System.out.println(autoBase[2].toString());
            } else if (driverId == 1) {
                autoBase[0].backToBase();
                System.out.println(autoBase[0].toString());
                System.out.println("\nПервый водитель успешно пришел на базу!\n");
                System.out.println("# |Bus\t\t|Driver\t|State");
                System.out.println("--+---------+-------+-----");
                System.out.println(autoBase[0].toString());
                System.out.println(autoBase[1].toString());
                System.out.println(autoBase[2].toString());

            } else if (driverId == 2) {
                autoBase[1].backToBase();
                System.out.println(autoBase[1].toString());
                System.out.println("\nВторой водитель успешно пришел на базу!\n");
                System.out.println("# |Bus\t\t|Driver\t|State");
                System.out.println("--+---------+-------+-----");
                System.out.println(autoBase[0].toString());
                System.out.println(autoBase[1].toString());
                System.out.println(autoBase[2].toString());

            } else if (driverId == 3) {
                autoBase[2].backToBase();
                System.out.println(autoBase[2].toString());
                System.out.println("\nТретий водитель успешно пришел на базу!\n");
                System.out.println("# |Bus\t\t|Driver\t|State");
                System.out.println("--+---------+-------+-----");
                System.out.println(autoBase[0].toString());
                System.out.println(autoBase[1].toString());
                System.out.println(autoBase[2].toString());

            } else {
                System.err.println("Не существует водителя под таким \"id\" ");
            }

            System.out.println("***************************");
            System.out.println("про каких грузовиках вы хотите получить информацию?");
            System.out.println("->  Состояние \"на базе\" - Нажмите клавищу \"О\"\n" +
                    "->  Состояние \"в пути\" - Нажмите клавищу \"R\"\n" +
                    "->  Состояние \"На ремонте\" - Нажмите клавищу \"P\"");
            state = scanner.next();
            if (state.equals("O")) {
                System.out.println("# |Bus\t\t|Driver\t|State");
                System.out.println("--+---------+-------+-----");

                if (autoBase[0].getState() == "On Base" && autoBase[1].getState() == "On Base" && autoBase[2].getState() == "On Base") {
                    System.out.println(autoBase[0].toString());
                    System.out.println(autoBase[1].toString());
                    System.out.println(autoBase[2].toString());
                } else if (autoBase[0].getState() == "On Base"&&autoBase[1].getState() == "On Base") {
                    System.out.println(autoBase[0].toString());
                    System.out.println(autoBase[1].toString());
                }else if (autoBase[0].getState() == "On Base"&&autoBase[2].getState() == "On Base") {
                    System.out.println(autoBase[0].toString());
                    System.out.println(autoBase[2].toString());
                }else if (autoBase[1].getState() == "On Base"&&autoBase[2].getState() == "On Base") {
                    System.out.println(autoBase[1].toString());
                    System.out.println(autoBase[2].toString());
                }
               else if (autoBase[0].getState() == "On Base") {
                    System.out.println(autoBase[0].toString());
                }
               else if (autoBase[1].getState() == "On Base") {
                    System.out.println(autoBase[1].toString());
                }
               else if (autoBase[2].getState() == "On Base") {
                    System.out.println(autoBase[2].toString());
                } else {
                    System.err.println("В базе нет водителя");
                }
            }else if (state.equals("R")) {
                System.out.println("# |Bus\t\t|Driver\t|State");
                System.out.println("--+---------+-------+-----");
                if (autoBase[0].getState() == "Route" && autoBase[1].getState() == "Route" && autoBase[2].getState() == "Route") {
                    System.out.println(autoBase[0].toString());
                    System.out.println(autoBase[1].toString());
                    System.out.println(autoBase[2].toString());
                } else if (autoBase[0].getState() == "Route"&&autoBase[1].getState() == "Route") {
                    System.out.println(autoBase[0].toString());
                    System.out.println(autoBase[1].toString());
                }else if (autoBase[0].getState() == "Route"&&autoBase[2].getState() == "Route") {
                    System.out.println(autoBase[0].toString());
                    System.out.println(autoBase[2].toString());
                }else if (autoBase[1].getState() == "Route"&&autoBase[2].getState() == "Route") {
                    System.out.println(autoBase[1].toString());
                    System.out.println(autoBase[2].toString());
                }else if (autoBase[0].getState() == "Route") {
                    System.out.println(autoBase[0].toString());
                }
               else if (autoBase[1].getState() == "Route") {
                    System.out.println(autoBase[1].toString());
                }
               else if (autoBase[2].getState() == "Route") {
                    System.out.println(autoBase[2].toString());
                } else {
                    System.err.println("В пути нет водителя");
                }
            } else if (state.equals("P")) {
                System.out.println("# |Bus\t\t|Driver\t|State");
                System.out.println("--+---------+-------+-----");
                if (autoBase[0].getState() == "Repair" && autoBase[1].getState() == "Repair" && autoBase[2].getState() == "Repair") {
                    System.out.println(autoBase[0].toString());
                    System.out.println(autoBase[1].toString());
                    System.out.println(autoBase[2].toString());
                } else if (autoBase[0].getState() == "Repair"&&autoBase[1].getState() == "Repair") {
                    System.out.println(autoBase[0].toString());
                    System.out.println(autoBase[1].toString());
                }else if (autoBase[0].getState() == "Repair"&&autoBase[2].getState() == "Repair") {
                    System.out.println(autoBase[0].toString());
                    System.out.println(autoBase[2].toString());
                }else if (autoBase[1].getState() == "Repair"&&autoBase[2].getState() == "Repair") {
                    System.out.println(autoBase[1].toString());
                    System.out.println(autoBase[2].toString());
                }else if (autoBase[0].getState() == "Repair") {
                    System.out.println(autoBase[0].toString());
                }
              else if (autoBase[1].getState() == "Repair") {
                    System.out.println(autoBase[1].toString());
                }
               else if (autoBase[2].getState() == "Repair") {
                    System.out.println(autoBase[2].toString());
                } else {
                    System.err.println("\nВ ремонте нет водителя!\n");
                }
            }
            System.out.println("Четвертый этап: \n" +
                    "После вывода таблиц, программа должна запросить у пользователя идентификатор (id) грузовика и вывести информацию о нем:");
           driverId=scanner.nextInt();
            System.out.println("# |Bus\t\t|Driver\t|State");
            System.out.println("--+---------+-------+-----");
            if (driverId==1){
                System.out.println(autoBase[0].toString());
            }else if(driverId==2){
                System.out.println(autoBase[1].toString());
            }else if(driverId==3){
                System.out.println(autoBase[2].toString());
            }else if(driverId==0){
                System.out.println(autoBase[0].toString());
                System.out.println(autoBase[1].toString());
                System.out.println(autoBase[2].toString());
            }else {
                System.out.println("нет водителья под таким id!");
            }
        }
    }
}
