package ba.sum.fsre.nramu_projekt;

import android.content.Context;
import android.widget.Toast;

public class Utility {

    static  void showToast(Context context,String message){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}
