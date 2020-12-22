import com.jacob.activeX.*;
import com.jacob.com.*;
import com.jacob.activeX.ActiveXComponent;

public class Mainly {

    static void depura (String cadenation){
        System.out.println("LammadaDcom"+cadenation);
    }

    public static void main(String[] args){
        depura("Running the app");
        ActiveXComponent sC = new ActiveXComponent("dcombasico.Application");
        Dispatch sControl = (Dispatch)sC.getObject();

        Variant result = Dispatch.call(sControl,"retornaHora");
        depura("THe result "+result.toString());
    }
}