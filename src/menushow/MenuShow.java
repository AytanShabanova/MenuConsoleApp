package menushow;

import db.DataBaseService;
import menuService.Menu;
import messageService.MessageService;
import scannerInit.ScannerInit;

import java.util.Scanner;

public class MenuShow {
    public static void menuShow() {
        Menu tea = new Menu(1,"tea", 3);
        Menu coffe = new Menu(2,"coffe", 5);
        Menu cheesecake = new Menu(3,"cheesekake", 7);
        DataBaseService.menuList.add(tea);
        DataBaseService.menuList.add(coffe);
        DataBaseService.menuList.add(cheesecake);
        for (Menu menu:DataBaseService.menuList
             ) {
            System.out.println(menu);

        }
       menuOrder();

    }
    public static void menuOrder(){
        int count;
        int sum;


        MessageService.messageSv("sifarisinizin nomresini daxil edin");
        ScannerInit scannerInit=new ScannerInit(new Scanner(System.in));
      int numberorder=  scannerInit.getScanner().nextInt();
      if (numberorder==1){
          MessageService.messageSv("sifarisinizin sayini daxil edin");
          count=scannerInit.getScanner().nextInt();
          sum=count*3;

         MessageService.messageSv2(sum,"azn-sifarisinizin deyeri.nush olsun");
      } else if (numberorder==2) {
          count=scannerInit.getScanner().nextInt();
          MessageService.messageSv("sifarisinizin sayini daxil edin");
          sum=count*5;
          MessageService.messageSv2(sum,"-azn sifarisinizin deyeri.nush olsun");
      } else if (numberorder==3) {
          MessageService.messageSv("sifarisinizin sayini daxil edin");
          count=scannerInit.getScanner().nextInt();
          sum=count*7;
          MessageService.messageSv2(sum,"azn-sifarisinizin deyeri.nush olsun");

      }

    }
}
