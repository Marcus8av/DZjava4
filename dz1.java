import java.util.LinkedList;

public class dz1 { // Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
    public static void main(String[] args) {
        int[] listMas = { 6, 43, 56, 14, 8, 9 };
        LinkedList<Integer> linkList = new LinkedList<>();

        for (Integer temp : listMas) {
            linkList.add(temp);
        }
        System.out.println("Заданный массив: " + linkList);

        int temp = 0;
        while (temp != linkList.size() - 1) {
            linkList.add(linkList.size() - temp, linkList.getFirst());
            linkList.removeFirst();
            temp++;
        }
        System.out.println("Массив перевернутый: " + linkList);
    }
}