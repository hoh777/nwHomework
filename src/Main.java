public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task8();






    }
    public static void task1 (){
        System.out.println("задача 1!");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);}
    public static void  task2(){
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);}
    public static void task3(){
        var dog = 12.0;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 7.6;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763793;
        System.out.println(paper);
        paper = paper -7639;
        System.out.println(paper);}
    public static void task4(){
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);}
    public static void task5(){
        var frog = 3.5;
        System.out.println(frog);
        frog =frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);}
    public static void task6(){
        var oneBoxerWeight = 78.2;
        var twoBoxerWeight =82.7;
        var athleteWeight = oneBoxerWeight + twoBoxerWeight;
        System.out.println("общий вес спортсменов"+ athleteWeight + "кг!" );


        var differenceWeinght = (athleteWeight - oneBoxerWeight) % twoBoxerWeight;
        System.out.println("остаток веса" + differenceWeinght + "кг!");}
    public static void task8(){
        var totalTime = 640;
        var openingHours = 8;
        var workers = totalTime / openingHours;
        System.out.println("сколько работников работает " + workers);

        var companyWorks = 94;
        var workingHours = 8;
        var hours = companyWorks * workingHours ;
        System.out.println("в компании работает 94 работника " + hours + "  часа поделяно между работниками");


















    }
}