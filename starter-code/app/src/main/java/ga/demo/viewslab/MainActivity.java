package ga.demo.viewslab;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {

    // ListView listView;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout mainLayout = (LinearLayout) findViewById(R.id.linearLayout);
        LayoutInflater li = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        int i;
        for (i = 1; i < 20; i += 2) {
            View listView = li.inflate(R.layout.new_list, null);
            TextView textView1 = (TextView) listView.findViewById(R.id.textView_1);
            TextView textView2 = (TextView) listView.findViewById(R.id.textView_2);
            Button btn1 = (Button) listView.findViewById(R.id.button_1);
            String str = "You clicked on the button below views number " + i + " and " + (i + 1);

            btn1.setTag(str);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(), view.getTag().toString(), Toast.LENGTH_SHORT).show();
                }
            });

            textView1.setText("This is TextView number " + i);
            textView2.setText("This is TextView number " + (i + 1));


            mainLayout.addView(listView);

//        final Button button = (Button) findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // Perform action on click
//                Toast.makeText(MainActivity.this, "You clicked button 1", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        final Button button2 = (Button) findViewById(R.id.button2);
//        button2.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // Perform action on click
//                Toast.makeText(MainActivity.this, "You clicked button 2", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        final Button button3 = (Button) findViewById(R.id.button3);
//        button3.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // Perform action on click
//                Toast.makeText(MainActivity.this, "You clicked button 3", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        final Button button4 = (Button) findViewById(R.id.button4);
//        button4.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // Perform action on click
//                Toast.makeText(MainActivity.this, "You clicked button 4", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        final Button button5 = (Button) findViewById(R.id.button5);
//        button5.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // Perform action on click
//                Toast.makeText(MainActivity.this, "You clicked button 5", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        final Button button6 = (Button) findViewById(R.id.button6);
//        button6.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // Perform action on click
//                Toast.makeText(MainActivity.this, "You clicked button 6", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        final Button button7 = (Button) findViewById(R.id.button7);
//        button7.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // Perform action on click
//                Toast.makeText(MainActivity.this, "You clicked button 7", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        final Button button8 = (Button) findViewById(R.id.button8);
//        button8.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // Perform action on click
//                Toast.makeText(MainActivity.this, "You clicked button 8", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        final Button button9 = (Button) findViewById(R.id.button9);
//        button9.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // Perform action on click
//                Toast.makeText(MainActivity.this, "You clicked button 9", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        final Button button10 = (Button) findViewById(R.id.button10);
//        button10.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // Perform action on click
//                Toast.makeText(MainActivity.this, "You clicked button 10", Toast.LENGTH_SHORT).show();
//            }
//        });

//        View.OnClickListener clickListener = new View.OnClickListener() {
//            public void onClick(View view) {
//                Toast.makeText(view.getContext(), "Button clicked!", Toast.LENGTH_SHORT).show();
//            }
//        };
//
//        mButton.setOnClickListener(clickListener);

//        // Put your Java code in here
//        // Get ListView object from xml
//        listView = (ListView) findViewById(R.id.listView);
//
//        mButton = (Button) findViewById(R.id.button1);
//        mButton.setVisibility(INVISIBLE);
//
//        // Defined Array values to show in ListView
//        String[] values = new String[] { "This is TextView number 1" + "\n" + "This is TextView number 2",
//                "This is TextView number 3" + "\n" + "This is TextView number 4",
//                "This is TextView number 5" + "\n" + "This is TextView number 6",
//                "This is TextView number 7" + "\n" + "This is TextView number 8",
//                "This is TextView number 9" + "\n" + "This is TextView number 10",
//                "This is TextView number 11" + "\n" + "This is TextView number 12",
//                "This is TextView number 13" + "\n" + "This is TextView number 14",
//                "This is TextView number 15" + "\n" + "This is TextView number 16",
//                "This is TextView number 17" + "\n" + "This is TextView number 18",
//                "This is TextView number 19" + "\n" + "This is TextView number 20"
//        };
//
//        // Define a new Adapter
//        // First parameter - Context
//        // Second parameter - Layout for the row
//        // Third parameter - ID of the TextView to which the data is written
//        // Forth - the Array of data
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
//                android.R.layout.simple_list_item_1, android.R.id.text1, values);
//
//        // Assign adapter to ListView
//        listView.setAdapter(adapter);

        }
    }
}
