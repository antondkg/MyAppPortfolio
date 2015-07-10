package info.antoniogoncalves.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private Button spotifyButton;
    private Button scoresButton;
    private Button libraryButton;
    private Button buildButton;
    private Button xyzButton;
    private Button captoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toolbar setup ----------------------------------------------------------------------------

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        //Buttons ----------------------------------------------------------------------------------

        spotifyButton = (Button) findViewById(R.id.spotify_streamer);

        spotifyButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "This button will launch my Spotify Streamer app!", Toast.LENGTH_SHORT).show();
            }
        });
        //------------------------------------------------------------------------------------------
        scoresButton = (Button) findViewById(R.id.scores_app);

        scoresButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "This button will launch my Scores app!", Toast.LENGTH_SHORT).show();
            }
        });
        //------------------------------------------------------------------------------------------
        libraryButton = (Button) findViewById(R.id.library_app);

        libraryButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "This button will launch my Library app!", Toast.LENGTH_SHORT).show();
            }
        });
        //------------------------------------------------------------------------------------------
        buildButton = (Button) findViewById(R.id.build_it_bigger);

        buildButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "This button will launch my Build It Bigger app!", Toast.LENGTH_SHORT).show();
            }
        });
        //------------------------------------------------------------------------------------------
        xyzButton = (Button) findViewById(R.id.xyz_reader);

        xyzButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "This button will launch my XYZ Reader app!", Toast.LENGTH_SHORT).show();
            }
        });
        //------------------------------------------------------------------------------------------
        captoneButton = (Button) findViewById(R.id.capstone);

        captoneButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "This button will launch my Capstone app!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
