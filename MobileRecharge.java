import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class MobileRecharge extends Services {
    // name + setter + getter
    public MobileRecharge(){
        this.name = "Mobile Recharge Service" ;
        providers = new ArrayList<>() ;
        providers.add("we") ;
        providers.add("vodafone") ;
        providers.add("orange") ;
        providers.add("etisalat") ;
    }
    @Override
    public Providers getProvider(String p){
        int val = 0 ;
        String pro = p.toLowerCase() ;
        Providers provider = null ;
        while(val==0){
            if(pro.contains("etisalat")){
                provider = new EtisalatMobile() ;
                val = 1;
            }
            else if(pro.contains("vodafon")){
                provider = new VodafoneMobile() ;
                val = 1;
            }
            else if(pro.contains("we")){
                provider = new WeMobile() ;
                val = 1;
            }
            else if(pro.contains("orange")){
                provider = new OrangeMobile() ;
                val = 1;
            }
            else{
                System.out.println("enter a valid value");
                Scanner obj = new Scanner(System.in) ;
                pro = obj.nextLine().toLowerCase() ;
            }
        }
        return provider ;
    }
}
