import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class 形参的改变不会影响实参 {
    //无论基本类型还是引用类型都符合该条规则
    public static void main(String[] args) {
        long[] a = {1,2,3,4};
        long[] b = {100,200,300,400};

        {
            long[] x = a;
            long[] y = b;

            long[] t = x;
            x = y;
            y = t;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));;
    }
}



