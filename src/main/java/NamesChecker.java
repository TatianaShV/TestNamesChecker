public class NamesChecker {
    public String maxName;
    public int quantitySymbols;

    public String maxName(String name) {
        while (true) {
            if (!Character.isUpperCase(name.charAt(0))) {
                System.out.println("Имена нужно вводить с большой буквы");
                break;
            }
            if (!oneName(name)){
                System.out.println("Введите одно имя");
                break;
            }
                if (quantitySymbols == 0) {
                    System.out.println(name + " - это первое введенное имя!");
                    maxName = name;
                    quantitySymbols = maxName.length();
                    break;
                } else {
                    if (maxName.length() >= name.length()) {
                        System.out.println("Самое длинное имя: " + maxName);
                        System.out.println("Не хватило символов: " + (maxName.length() - name.length()));
                        break;
                    } else {
                        maxName = name;
                        quantitySymbols = name.length();
                        System.out.println("Самое длинное имя: " + maxName);
                        break;
                    }
                }
            }
        return maxName;
    }
    public boolean oneName(String name){
       String[] input = name.split(" ");
       if(input.length < 2){
        return true;
    }return false;
    }
}


