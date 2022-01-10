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
        AutoBase[] autoBase = {new AutoBase(1, "Renault", "Nurik", "On Base"),
                new AutoBase(2, "Volvo", "Aktan", "On Base"),
                new AutoBase(3, "DAF XT", "Elmir", "On Base")};
        Process process=new Process();
        System.out.println("В данный момент все маршруты On Base!");
        System.out.println("# |Bus\t\t|Driver\t|State");
        System.out.println("--+---------+-------+-----");
        System.out.println(autoBase[0].toString());
        System.out.println(autoBase[1].toString());
        System.out.println(autoBase[2].toString());
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
