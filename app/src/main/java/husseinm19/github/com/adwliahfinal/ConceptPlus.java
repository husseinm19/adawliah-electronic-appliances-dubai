package husseinm19.github.com.adwliahfinal;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class ConceptPlus extends AppCompatActivity {
    int concept_plus_images[] = { R.drawable.con1,  R.drawable.con2
            , R.drawable.con3 , R.drawable.con4
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concept_plus);


        LinearLayout layout = (LinearLayout) findViewById(R.id.linear2);
        for (int i = 0; i < 4; i++) {
            ImageView imageView = new ImageView(this);
            imageView.setId(i);
            imageView.setPadding(2, 2, 2, 2);
            imageView.setImageBitmap(BitmapFactory.decodeResource(
                    getResources(), concept_plus_images[i]));

            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            layout.addView(imageView);
        }

        Button callButton = (Button) findViewById(R.id.btn_call_conept);


        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "0552264609"));
                startActivity(intent);

            }
        });
    }
}
