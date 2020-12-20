//package core.juja;
//
//import java.util.Arrays;
//
//class OdessaSeaPort implements SeaPortQueue {
//    private static final int NO_SHIP_IN_ARRAY = -1;
//    private int indexShipInPort = NO_SHIP_IN_ARRAY;
//    private AbstractShip[] arrayShip;
//    private int putloc, getloc; //индексы для вставки и извлечения элементов очереди
//    private int count;
//
//    public OdessaSeaPort(){     // конструктор инициализации
//        arrayShip = new AbstractShip[LENGTH_QUEUE_SHIP];
//        putloc = getloc = 0;
//        count=0;
//    }
//
//    @Override
//    public int addShipToEndQueue(AbstractShip ship) {
//
//
////       if(count==arrayShip.length)
////       {
////       System.out.println("очередь заполнена");
////       return -1;}
//
//        arrayShip[putloc] = ship;
//        putloc++;
//        if (putloc == arrayShip.length) putloc=0;
//        count++;
//
//
//     return 1;
//    }
//
//
//    public int removeShipFromBeginQueue(){
//
//        arrayShip[0] = arrayShip [1];
//        arrayShip[1] = arrayShip [2];
//        arrayShip[2] = null;
//
//       return 1;
//    }
//
//    public String printQueueShip(){
//
////        for(int i=0; i<arrayShip.length;i++)
////            System.out.println( arrayShip[i].toPrint() );
//
//        System.out.println(arrayShip[0].toPrint());
//        System.out.println(arrayShip[1].toPrint());
//        System.out.println(arrayShip[2]);
//    return "заглушился";
//    };
//
//}