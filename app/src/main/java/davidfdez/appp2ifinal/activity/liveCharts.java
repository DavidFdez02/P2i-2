package davidfdez.appp2ifinal.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import davidfdez.appp2ifinal.R;

public class liveCharts extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_charts);



    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            // finish the activity
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public class WebAppInterface {
        @JavascriptInterface
        public int getWeb(){

            return 0;

        }
    }

}