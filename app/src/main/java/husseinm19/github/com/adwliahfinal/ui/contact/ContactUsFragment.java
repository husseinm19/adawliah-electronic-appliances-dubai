package husseinm19.github.com.adwliahfinal.ui.contact;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import husseinm19.github.com.adwliahfinal.R;

public class ContactUsFragment extends Fragment {
    String websiteURL = "https://www.adawliah-cookware.com";
    String fburl = "https://www.facebook.com/aDwliahElectronicAppliances/";
    String yturl = "https://www.youtube.com/channel/UC5tyndlZLmlybr9QBQjEiow";


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.contact_us, container, false);

        ImageView callImage1 = (ImageView) root.findViewById(R.id.call_CS);


        callImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "0552264609"));
                startActivity(intent);

            }
        });
//        Button callButton3 = (Button) root.findViewById(R.id.btn_call3);
//        callButton3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "0552264609"));
//                startActivity(intent);
//
//            }
//        });

        ImageView callImage2 = (ImageView) root.findViewById(R.id.call_Norder);


        callImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "0552264609"));
                startActivity(intent);

            }
        });

        ImageView facebook = (ImageView) root.findViewById(R.id.facebook);
        ImageView youtube = (ImageView) root.findViewById(R.id.youtube);
        ImageView website = (ImageView) root.findViewById(R.id.website);
        ImageView whatsapp = (ImageView) root.findViewById(R.id.wwhatsapp);

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent website = new Intent(Intent.ACTION_VIEW);
                website.setData(Uri.parse(fburl));
                startActivity(website);
            }
        });

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent website = new Intent(Intent.ACTION_VIEW);
                website.setData(Uri.parse(yturl));
                startActivity(website);
            }
        });

        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent website = new Intent(Intent.ACTION_VIEW);
                website.setData(Uri.parse(websiteURL));
                startActivity(website);

            }
        });

        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("smsto:" + "+971552264609");
                Intent i = new Intent(Intent.ACTION_SENDTO , uri);
                i.setPackage("com.whatsapp");
                startActivity(i);

            }
        });
        return root;
    }



}