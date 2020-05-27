package com.iheart.training;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//	Book book1 = new Book("Canada", 120);
//	book1.save();
//
//        SorterManager mergeManager = new SorterManager();
//        mergeManager.sort(new MergeSort());

//        SorterManager insertManager =  new SorterManager();
//        insertManager.sort(new InsertionSort());

//         //Open Closed Principle: Strategy pattern/Template pattern
//          SorterManager quickManager = new SorterManager();
//          quickManager.sort(new QuickSort());

          //Fails Liskov Principle
//        Vehicle car = new ElectricCar();
//
//        if(car instanceof ElectricCar) {
//            System.out.println("Unable to add fuel");
//        }
//        else{
//            car.addFuel();
//        }

        //Applies Liskov Principle
//        ElectricVehicle eCar = new ElectricCar();
//        eCar.chargeBattery();

        //Applies Interface Segregation Principle
//        Tree binarySearchTree = new BinarySearchTree();
//        Tree balancedTree = new BalancedTree();

        //Fails Dependency Inversion Principle
//        DatabaseHandler databaseHandler = new DatabaseHandler();
//        databaseHandler.connect();
//        databaseHandler.disconnect();

        //Applies Dependency Inversion Principle
//        DatabaseHandler databaseHandler = new DatabaseHandler(new OracleDatabase());
//        databaseHandler.connect();
//        databaseHandler.disconnect();

        //Applies Strategy Pattern
//        Manager manager = new Manager();
//        manager.setStrategy(new Multiply());
//        manager.operation(1,3);

        //Applies Observer Pattern
//        WeatherStation station = new WeatherStation();
//        WeatherObserver observer = new WeatherObserver(station);
//        station.setHumidity(100);
//        station.setPressure(200);
//        station.setTemperature(300);

        //Applies Command Pattern
//        Switcher switcher = new Switcher();
//        Light light = new Light();
//        TurnOffCommand offCommand = new TurnOffCommand(light);
//        TurnOnCommand onCommand = new TurnOnCommand(light);
//        switcher.addCommand(offCommand);
//        switcher.addCommand(onCommand);
//        switcher.executeCommands();

        //Applies Command Pattern 2
//        final Algorithm algorithm = new Algorithm();
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                algorithm.produce();
//            }
//        });
//
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                algorithm.consume();
//            }
//        });
//
//        t1.start();
//        t2.start();

        //Applies Iterator Pattern
//        NameRepository nameRepository = new NameRepository();
//        for(Iterator iter = nameRepository.getIterator(); iter.hasNext();){
//            String name = (String) iter.next();
//            System.out.println(name);
//        }


        //Applies Template Pattern
//        int[] numbers = {1,5,3,8,2,-2,10};
//        AlgorithmT sortAlgorithm = new BubbleSort(numbers);
//        sortAlgorithm.sort();
//        System.out.println(".............\n");
//        AlgorithmT sortAlgorithmI = new InsertionSortT(numbers);
//        sortAlgorithmI.sort();

        //Applies Null Object Pattern
//        CustomerFactory customerFactory = new CustomerFactory();
//        System.out.println("Customer exists...........");
//        System.out.println(customerFactory.getCustomer("Joe").getCustomer());
//        System.out.println("Customer does not exist.............");
//        System.out.println(customerFactory.getCustomer("Kevin").getCustomer());

        //Applies Visitor Pattern
//        List<ShoppingItem> items = new ArrayList<>();
//        items.add(new Table("desk", 20));
//        items.add(new Chair("chh", 30));
//        items.add(new Chair("cii", 25));
//
//        double sum = 0;
//        ShoppingCartVisitor shoppingCart = new ShoppingCart();
//
//        for(ShoppingItem s : items){
//            sum = sum + s.accept(shoppingCart);
//        }
//        System.out.println("Total cost of all items in cart: " + sum);

        //Applies Singleton Pattern
//        Downloader.getInstance().startDownloading();
//        Downloader d = Downloader.getInstance();
//        Downloader d2 = Downloader.getInstance();
//
//        if(d==d2){
//            System.out.println("They are the same!");
//        }
//
//        d.startDownloading();
//        d2.startDownloading();

        //Applies Singleton Pattern 2
//        SingletonClass.INSTANCE.setCounter(10);
//        System.out.println(SingletonClass.INSTANCE.getCounter());

        //Applies Factory Pattern
//        AlgorithmF algorithmF = AlgorithmFactory.createAlgorithm(AlgorithmFactory.SHORTEST_PATH);
//        algorithmF.solve();
//        AlgorithmF algorithmS = AlgorithmFactory.createAlgorithm(AlgorithmFactory.SPANNING_TREE);
//        algorithmS.solve();

        //Builder Pattern
//        Person person = new Person.Builder("Kevin", "kevin@gmail.com").setAge(15).setAddress("Huddon Rd").build();
//        System.out.println(person);

        //Data Access Object pattern
//        DatabaseD databaseD = new DatabaseD();
//        PersonD adam = new PersonD("Adam", 55);
//        databaseD.insert(new PersonD("John",27));
//        databaseD.insert(new PersonD("Sam",22));
//        databaseD.insert(new PersonD("Cam",75));
//        databaseD.insert(adam);
//
//        for(PersonD personD : databaseD.getPeople()){
//            System.out.println(personD);
//        }
//        databaseD.remove(adam);
//        System.out.println(" ");
//
//        for(PersonD person : databaseD.getPeople()){
//            System.out.println(person);
//        }

        //Applies Decorator Pattern
//        Beverage b = new Sugar(new Sugar(new Milk(new PlainBeverage())));
//        System.out.println(b.getCost());
//        System.out.println(b.getDescription());


        //Applies Facade Pattern
//        SortingManagerF managerF = new SortingManagerF();
//        managerF.doBubbleSort();
//        managerF.doMergeSort();
//        managerF.doQuickSort();

        //Applies Adapter Pattern
//        VehicleA bus = new BusA();
//        VehicleA car = new CarA();
//        VehicleA bicycle = new BicycleAdapter(new BicycleA());
//
//        bus.accelerate();
//        car.accelerate();
//        bicycle.accelerate();


    }
}
