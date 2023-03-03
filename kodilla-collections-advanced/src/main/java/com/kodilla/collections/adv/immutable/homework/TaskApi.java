package com.kodilla.collections.adv.immutable.homework;

public class TaskApi {
    public static void main(String[] args) {
        TaskVer2 taskVer2 = new TaskVer2("TestVer2", 12);
        System.out.println(taskVer2);
        System.out.println("-----------------------");
        TaskVer2Record taskVer2Record = new TaskVer2Record("Record test", 11);
        System.out.println(taskVer2Record);
        System.out.println("-----------------");
        Task task = new Task("Final test", 10);
        System.out.println(task);

    }
}
