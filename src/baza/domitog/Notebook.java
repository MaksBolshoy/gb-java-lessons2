package baza.domitog;
//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
//“Введите цифру, соответствующую необходимому критерию:
//1 - ОЗУ
//2 - Объем ЖД
//3 - Операционная система
//4 - Цвет …
//Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.


import java.util.*;

public class Notebook {
    private String model;
    private int ram;
    private int hdd;
    private String operatingSystem;
    private String color;

    public Notebook(String model, int ram, int hdd, String operatingSystem, String color) {
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //Метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру:

    public static void filterNotebooks(Collection<Notebook> notebooks, Map<String, Object> filter) {
        for (Notebook notebook : notebooks) {
            boolean matchesFilter = true;
            for (String key : filter.keySet()) {
                Object value = filter.get(key);
                switch (key) {
                    case "ram":
                        matchesFilter &= notebook.getRam() >= (int) value;
                        break;
                    case "hdd":
                        matchesFilter &= notebook.getHdd() >= (int) value;
                        break;
                    case "operatingSystem":
                        matchesFilter &= notebook.getOperatingSystem().equals(value);
                        break;
                    case "color":
                        matchesFilter &= notebook.getColor().equals(value);
                        break;
                    default:
                        break;
                }
            }
            if (matchesFilter) {
                System.out.println(notebook.getModel());
            }
        }

    }



    public static void buka () {
        Collection<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("Model 1", 8, 512, "Windows 10", "Black"));
        notebooks.add(new Notebook("Model 2", 16, 1024, "MacOS", "Silver"));
        notebooks.add(new Notebook("Model 3", 4, 256, "Linux", "Red"));
        Map<String, Object> filter = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter filter criteria:");
        System.out.println("1 - RAM");
        System.out.println("2 - HDD");
        System.out.println("3 - Operating system");
        System.out.println("4 - Color");
        String input = sc.nextLine();
        switch (input) {
            case "1":
                System.out.println("Enter minimum RAM:");
                int ram = Integer.parseInt(sc.nextLine());
                filter.put("ram", ram);
                break;
            case "2":
                System.out.println("Enter minimum HDD:");
                int hdd = Integer.parseInt(sc.nextLine());
                filter.put("hdd", hdd);
                break;
            case "3":
                System.out.println("Enter operating system:");
                String os = sc.nextLine();
                filter.put("operatingSystem", os);
                break;
            case "4":
                System.out.println("Enter color:");
                String color = sc.nextLine();
                filter.put("color", color);
                break;
            default:
                break;
        }
        filterNotebooks(notebooks, filter);
    }

}
