package fi.arcada.codechallenge;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    // När vi initsierar en variable innan metoden (t.ex. onCreate())
    // kommer de vara synliga/tillgängliga för hela klassen (i.e., MainActivity / som är denna fil)
    // Om vi gör dem public kommer de även synas för andra klasser (i.e., Statistics / den andra filen)
    // Vi behöver dock endast variablerna för vår TextView element och Button element i denna klass
    // Därför gör vi dem här innan onCreate()

    TextView myview; //eggs, ham, spam - Andra vanliga varible namn (i Python)
    Button myButton;

    // Här är ett sätt att initisera en ArrayList och en array
    // Det finns många olika sätt
    ArrayList<Double> myNumbersArrayList = new ArrayList<>(Arrays.asList(1.0,2.0,3.0,4.0,5.0)); // ArrayList
    double[] myNumbersArray = {1.0,2.0,3.0,4.0,5.0}; // array

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hitta våra View och Button items som vi gjorde i design vyn (activity_main.xml)
        // Allokera dem dem till variablerna vi gjorde tidigare : annars är variablerna bara tomma
        // Och design elementen (TextView och Button) bara där utan några funktioner

        myview = findViewById(R.id.MyView);
        myButton = findViewById(R.id.myButton);
        // Varför id.MyView och id.myButton? För det är IDn vi gav till design elementet i activity_main.xml
        // Precis som i JS/CSS måste vi ha ett ID på ett <HTML> element för att kunna hitta det och ändra på det

        // Man kan också lägga till fler nummer i en arraylist eller initisera dem så här
        //myNumbersArrayList.add(6.0);
        // Kom ihåg - Man kan inte lägga till i en array - Då måste man göra en ny större array först, sen lägga till mer nummer

        // Ändra på texten i myview och myButton
        myview.setText("My first app");
        myButton.setText("CLICK ME!");
        // För den som var intresserad kunde man även använda sig av res/@strings

        // Button clickButton = (Button) findViewById(R.id.myButton);
        // Make and find in onCreate

        /*

            Här är ett annat sätt att tilldela en onClick
            Men som nämndes på lektionen, kan det vara enklare att gör en metod (t.ex. onCalculate - se nedanför)
            Och sedan sätta den som funktionen som skall användas direkt i design vyn (activity_main.xml)
            Obs! onCalculate hittas endast i design vyn om den finns, så gör en tom metod först


            - Alternativa sättet att sätta en onClick
        myButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
            }
        });

        */
    }

    // en onCalculate metod
    // Den kan nu sättas i onClick direkt från den "dropdown" i design vyn på knappen
    // hittas under Declared Attributes på knappen)
    public void onCalculate(View view) {

        // Statistics.calcMean(myNumbersArray)
        double mean = 0;
        Statistics myStat = new Statistics();
        mean = myStat.calcMean(myNumbersArrayList);

        Log.i("Results", String.valueOf(mean));

    }
}