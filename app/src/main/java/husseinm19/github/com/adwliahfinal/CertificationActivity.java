package husseinm19.github.com.adwliahfinal;

import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.widget.ImageView;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.FitPolicy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import androidx.annotation.RawRes;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import husseinm19.github.com.adwliahfinal.R;

public class CertificationActivity extends AppCompatActivity {
//    int certifications_images[] = { R.drawable.c1,  R.drawable.c2
//            , R.drawable.c3 , R.drawable.c4 , R.drawable.c5 , R.drawable.c6 , R.drawable.c7
//            , R.drawable.c8 , R.drawable.c9 , R.drawable.c10 , R.drawable.c11 , R.drawable.c12
//            , R.drawable.c13 , R.drawable.c14 , R.drawable.c15 , R.drawable.c16 , R.drawable.c17
//            , R.drawable.c18 , R.drawable.c19 , R.drawable.c20 , R.drawable.c21 , R.drawable.c22
//            , R.drawable.c23 , R.drawable.c24 , R.drawable.c25
//    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certification);


        //PDF View
        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("pdf.pdf")
                .enableSwipe(true) // allows to block changing pages using swipe
                .swipeHorizontal(true)
                .enableDoubletap(true)
                .defaultPage(0)
                .enableAnnotationRendering(false) // render annotations (such as comments, colors or forms)
                .password(null)
                .scrollHandle(null)
                .enableAntialiasing(true) // improve rendering a little bit on low-res screens
                // spacing between pages in dp. To define spacing color, set view background
                .spacing(0)
                .pageFitPolicy(FitPolicy.WIDTH)
                .load();

    }
}
