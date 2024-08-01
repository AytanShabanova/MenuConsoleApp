import EnryEnum.Entry;
import db.DataBaseService;
import menuService.Menu;
import menushow.MenuShow;
import messageService.MessageService;
import scannerInit.ScannerInit;

import java.util.Scanner;

public class StrartApp {
    public static void start(){
        int entrynumber=0;
        ScannerInit scannerInit=new ScannerInit(new Scanner(System.in));
        MessageService.messageSv("menuya daxil olmaq ucun 1 \n cixis ucun 2 secin");
       entrynumber= scannerInit.getScanner().nextInt();


     while (entrynumber!= Entry.EXIT.getOrder()){
      if (entrynumber==1){
          MenuShow.menuShow();
          break;
      }else return;

     }
     entrynumber=Entry.EXIT.getOrder();
     System.exit(1);

    }
    public static void startMessage(){
       MessageService.messageSv2(Entry.MENU.getOrder(), Entry.MENU.getMenu());
MessageService.messageSv2(Entry.EXIT.getOrder(), Entry.EXIT.getMenu());
       start();
    }


}
