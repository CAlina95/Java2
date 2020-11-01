
package ru.homework1;

/*
1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
 */

import java.util.Random;

public class Main {

    private static final Random random = new Random();

        static int humans = 1; //Человек
        static int cats = 1; //Кот
        static int robots = 1; //Робот
        static int obstacle = 1; //Препятствия


        static Human[] human = new Human[humans];
        static Cat[] cat = new Cat[cats];
        static Robot[] robot = new Robot[robots];
        static Wall[] wall = new Wall[obstacle];
        static Treadmill[] treadmill = new Treadmill[obstacle];


        public static void makeHuman() {
            for (int i = 0; i < humans; i++) {
                human[i] = new Human("Алина");
                System.out.println("Человек: " + human[i].getName());

            }
        }

        public static void makeCat() {
            for (int i = 0; i < cats; i++) {
                cat[i] = new Cat("Том");
                System.out.println("Кот: " + cat[i].getName());

            }
        }

        public static void makeRobot() {
            for (int i = 0; i < robots; i++) {
                robot[i] = new Robot("Аибо");
                System.out.println("Робот: " + robot[i].getName());

            }
        }

        public static void makeTreadmills() {
            for (int i = 0; i < obstacle; i++) {
                treadmill[i] = new Treadmill(random.nextInt(50));
                System.out.println("Беговая дорожка: " + treadmill[i].getDistance());
            }
        }

        public static void makeWalls () {
            for (int i = 0; i < obstacle; i++) {
                wall[i] = new Wall(random.nextInt(5));
                System.out.println("Стена: " + wall[i].getHeight());
            }
        }

        public static void humanTest() {
            for (int i = 0; i < humans; i++) {
                System.out.println("/////////////////////////////////////////////////////////////////////////////");
                int place = 0;
                human[i].maxWallValue = 0;
                human[i].maxTreadmillValue = 0;

                for (int j = 0; j < obstacle; j++) {
                    human[i].maxWallValue = wall[j].getHeight();
                    human[i].maxTreadmillValue = treadmill[j].getDistance();
                    if (human[i].canJump()) {
                        if (human[i].canRun()) {
                            place++;
                        } else break;
                    } else break;
                }
                if (place == obstacle) {
                    System.out.println("Отлично!! Вы прошли все препятствия!!");
                } else {
                    System.out.println("Жаль вы не прошли. Попробуйте в следующий раз.");
                }
            }
        }

        public static void catTest() {
            for (int i = 0; i < cats; i++) {
                System.out.println("///////////////////////////////////////////////////////////////////////////");
                int place = 0;
                cat[i].maxWallValue = 0;
                cat[i].maxTreadmillValue = 0;
                for (int j = 0; j < obstacle; j++) {
                    cat[i].maxWallValue = wall[j].getHeight();
                    cat[i].maxTreadmillValue = treadmill[j].getDistance();
                    if (cat[i].canJump()) {
                        if (cat[i].canRun()) {
                            place++;
                        } else break;
                    } else break;
                }
                if (place == obstacle) {
                    System.out.println("Отлично!! Вы прошли все препятствия!!");
                } else {
                    System.out.println("Жаль вы не прошли. Попробуйте в следующий раз.");
                }
            }
        }

        public static void robotTest() {
            for (int i = 0; i < robots; i++) {
                System.out.println("//////////////////////////////////////////////////////////////////////////");
                int place = 0;
                robot[i].maxWallValue = 0;
                robot[i].maxTreadmillValue = 0;
                for (int j = 0; j < obstacle; j++) {
                    robot[i].maxWallValue = wall[j].getHeight();
                    robot[i].maxTreadmillValue = treadmill[j].getDistance();
                    if (robot[i].canJump()) {
                        if (robot[i].canRun()) {
                            place++;
                        } else break;
                    } else break;
                }
                if (place == obstacle) {
                    System.out.println("Отлично!! Вы прошли все препятствия!!");
                } else {
                    System.out.println("Жаль вы не прошли. Попробуйте в следующий раз.");
                }
            }
        }


        public static void main (String[]args){


            makeHuman();
            makeCat();
            makeRobot();
            makeWalls();
            makeTreadmills();
            human[0].info();
            cat[0].info();
            robot[0].info();

            //Проверяем сможет пройти препятствия
           humanTest();
           catTest();
           robotTest();


        }
    }

