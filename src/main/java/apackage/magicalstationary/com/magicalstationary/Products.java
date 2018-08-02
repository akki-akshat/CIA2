package apackage.magicalstationary.com.magicalstationary;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Products extends AppCompatActivity {

    Product1 pen = new Product1();
    Product2 pencil = new Product2();
    Product3 notebook = new Product3();
    Product4 eraser = new Product4();
    RadioButton rb;
    RadioGroup rg1;
    Button buys;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_products);
        rg1 = (RadioGroup)findViewById(R.id.rg);
        buys = (Button)findViewById(R.id.buy);

        buys.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                int selectedId = rg1.getCheckedRadioButtonId();
                rb = (RadioButton)findViewById(selectedId);
                if(rb.getText()=="Pen"){
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment,pen);
                    fragmentTransaction.commit();
                }
                else if(rb.getText()=="Pencil"){
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment,pencil);
                    fragmentTransaction.commit();
                }
                else if(rb.getText()=="NoteBook"){
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment,notebook);
                    fragmentTransaction.commit();
                }
                else if(rb.getText()=="Eraser"){
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment,eraser);
                    fragmentTransaction.commit();
                }

            }

        });

    }
}
