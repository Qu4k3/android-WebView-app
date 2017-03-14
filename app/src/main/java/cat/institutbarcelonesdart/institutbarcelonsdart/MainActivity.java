package cat.institutbarcelonesdart.institutbarcelonsdart;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

    WebView myWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        setPage();
    }

    private void setPage(){
        myWeb = (WebView) findViewById(R.id.myViewId);
        WebSettings mySetting = myWeb.getSettings();
        mySetting.setJavaScriptEnabled(true);

        myWeb.loadUrl("http://qu4k3.com");

        myWeb.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (myWeb.canGoBack())
            myWeb.goBack();
        else

        super.onBackPressed();
    }
}
