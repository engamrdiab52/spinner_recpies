package com.amrdiab.spinner_recpies;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
//spinner1:
// you need a button to take the choice from the spinner to the text view (as there is no listner )
// comment to check git
public class MainActivity extends Activity {
        Spinner spinner1;
        TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1 = findViewById(R.id.spinner1);
        textView = findViewById(R.id.text_1);
        /*
        you can use entries attribute in the spinner for static data,
        but for dynamic u have ti use array adapter,
        an array maybe defined in the strings resource or in a separate resource.*/
        /*
        * u can use enum to save the array and use its tostring method to get its values
        * */
        ArrayAdapter<myEnum> adapter2 = new ArrayAdapter<>(
                this,android.R.layout.simple_spinner_item,myEnum.values());
        spinner1.setAdapter(adapter2);

        //ArrayAdapter<CharSequence> adapter = ArrayAdapter.
          //      createFromResource(this,R.array.array_1,android.R.layout.simple_spinner_item);
        //spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //position in the spinner
                //ID in the R file
                String string = String.valueOf(spinner1.getSelectedItem());
                textView.setText(string);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

}
