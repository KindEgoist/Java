package org.example.lectures.l7oop.l7_2;

/**
 * ОПП: Инкапсуляция - это свойство системы, позволяющее объединить данные и методы, работающие
 * с ними в классе, скрыв детали реализации и защитив от пользователя этого класса объектов.
 */
public class Pro2 {
    public static void main(String[] args) {
        // # region Robot1 demo
        Robot1 robot1 = new Robot1("name_1", 1);

        System.out.printf("%s %d\n", robot1.name, robot1.level);
        robot1.startBIOS();
        robot1.startOS();
        robot1.sayHi();

        robot1.work();
        robot1.work();
        robot1.work();

        robot1.sayBay();
        robot1.stopOS();
        robot1.sayBay();
        //#endregion

        robot1.level = 100500;
        System.out.printf("%s %d\n", robot1.name, robot1.level);
        System.out.println();
        // #region Robot2 demo

        Robot2 robot2 = new Robot2("name_2", 1);

        System.out.printf("%s %d\n", robot2.getName(), robot2.getLevel());
        robot2.powerOn();
        robot2.work();
        robot2.powerOff();
        System.out.println();

        //#endregion

        //#region Robo3 demo

        Robot3 robot3 = new Robot3("name_3");
        System.out.println("-------------");
        System.out.println(robot3);
        robot3.power();
        robot3.work();
        robot3.power();
        robot3.work();

        robot3.power();

        //#endregion
    }
}
