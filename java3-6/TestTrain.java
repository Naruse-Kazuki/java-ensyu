class Item{
    int id;
    String name;
    int price;
    Item(int tmpId, String tmpName, int tmpPrice){
        id = tmpId;
        name = tmpName;
        price = tmpPrice;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    int getPrice(){
        return price;
    }
}

class TestItem{
    public static void main(String[] args){
        Item it1 = new Item(1,"Mobile Phone",60000);
        Item it2 = new Item(2,"LapTop",190000);
        Item it3 = new Item(3,"Desktop Computer",150000);
        Item it4 = new Item(4,"Blu-ray Drive",20000);
        System.out.println(it1.getId()+" | "+it1.getName()+" | ¥"+it1.getPrice());
        System.out.println(it2.getId()+" | "+it2.getName()+" | ¥"+it2.getPrice());
        System.out.println(it3.getId()+" | "+it3.getName()+" | ¥"+it3.getPrice());
        System.out.println(it4.getId()+" | "+it4.getName()+" | ¥"+it4.getPrice());
    }
}