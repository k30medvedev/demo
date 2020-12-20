//package inner.outer;
//
//public class MainStart  {
//
//    public static void main(String[] args) {
//// создаем анонимный класс,который выглядит как будто обьект интерфейса.
//    MonitoringSystem generalModul = new MonitoringSystem() {
//        public void startMonitoring() {
//
//            System.out.println("Стартовал главный модуль");
//        }
//
//    };
//
//    MonitoringSystem errorModul = new MonitoringSystem() {
//        public void startMonitoring() {
//
//            System.out.println("Стартовал модуль ошибок");
//        }
//    };
//
//    MonitoringSystem securityModul = new MonitoringSystem() {
//        public void startMonitoring() {
//                   System.out.println("Раз раз"); }
//        public void startDiagnostic(){
//          System.out.println("213");
//        };
//
//       };
//
//generalModul.startMonitoring();
//errorModul.startMonitoring();
//securityModul.startMonitoring();
//securityModul.startDiagnostic();// ошибка! мы не можем получить новые методы,не описанные в интерфейсе.
//    }
//
//
//}
//
