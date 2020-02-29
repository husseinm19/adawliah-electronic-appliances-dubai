package husseinm19.github.com.adwliahfinal;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DimaondTitanBest extends AppCompatActivity {
    int dimaond_titan_images[] = {R.drawable.dtb11, R.drawable.dtb1, R.drawable.dtb2, R.drawable.dtb3
            , R.drawable.dtb4 , R.drawable.dtb5 , R.drawable.dtb6 , R.drawable.dtb7 , R.drawable.dtb8
            , R.drawable.dtb9 , R.drawable.dtb10 , R.drawable.titanbestthree};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dimaond_titan_best);




        LinearLayout layout = (LinearLayout) findViewById(R.id.linear);
        for (int i = 0; i < 10; i++) {
            ImageView imageView = new ImageView(this);
            imageView.setId(i);
            imageView.setPadding(2, 2, 2, 2);
            imageView.setImageBitmap(BitmapFactory.decodeResource(
                    getResources(), dimaond_titan_images[i]));

            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            layout.addView(imageView);
        }
        Button callButton = (Button) findViewById(R.id.btn_call_titan);


        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "0552264609"));
                startActivity(intent);

            }
        });

//        TextView titanTextView = (TextView) findViewById(R.id.titan_text_view);
//        titanTextView.setText("امكانيه الطبخ بدون زيت وسمن ودهون حيث حريه الاكل لمرضى الكليسترول\n");
    }
}
