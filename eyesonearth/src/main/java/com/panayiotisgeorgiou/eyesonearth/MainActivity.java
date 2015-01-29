package com.panayiotisgeorgiou.eyesonearth;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebView;


public class MainActivity extends Activity {

    private WebView webView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        //webView.loadUrl("http://www.google.com");

        String customHtml = "<html>\n" +
                "<head>\n" +
                "<meta name = \"viewport\" content = \"width = device-width, height = device-height\" />\n" +
                "\n" +
                "<style>\n" +
                "iframe {\n" +
                "\twidth: 100%;\n" +
                "\theight: 100%;\n" +
                "}\n" +
                "</style>\n" +
                "\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<iframe src=\"http://www.ustream.tv/embed/17074538?wmode=direct\" \n" +
                "\tstyle=\"border: 0 none transparent;\" \n" +
                "\tframeborder=\"no\"></iframe><br />\n" +
                "\n" +
                "</body>\n" +
                "</html>\n";
        webView.loadData(customHtml, "text/html", "UTF-8");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
