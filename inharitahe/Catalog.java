//package inharitahe;
//
//public class Catalog {
//    public static void main(String[] args) {
//
//
//        Issue book1 = new Book("Скакзи", 222, "Джоан Рулит");
//        Issue book2 = new Book("Ужасы", 115, "Хитрый пёс");
//        Issue jur = new Journal("MAXIM", 69, "1991", "44");
//        Issue jur2 = new Journal("Pron", 87, "2011", "1");
//
//
//        Issue[] catalog = new Issue[4];
//        catalog[0] = book1;
//        catalog[1] = book2;
//        catalog[2] = jur;
//        catalog[3] = jur2;
//
//
//
//        for (int i = 0; i < catalog.length; i++) {
//            if (catalog[i].getCountPages()>300){
//                System.out.println("Вот оно" + catalog[i].toPrint());
//
//             }
//
//        }
//    }
//
//
//    }
//
//
//
//
////
////     public void printAvailableBooks() {
////		if(numberOfBooks == 0)
////			System.out.println("No book in catalogue");
////		for(int i=0; i<numberOfBooks; i++)
////			if(!bookCollection[i].isBorrowed())
////				System.out.println(bookCollection[i].getTitle());
//
