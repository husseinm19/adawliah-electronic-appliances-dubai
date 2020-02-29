package husseinm19.github.com.adwliahfinal.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import husseinm19.github.com.adwliahfinal.ConceptPlus;
import husseinm19.github.com.adwliahfinal.DimaondTitanBest;
import husseinm19.github.com.adwliahfinal.R;

public class HomeFragment extends Fragment {


    ViewFlipper viewFlipper;
    ViewFlipper viewFlippert;
    FragmentManager fragmentManager;
    int dimaond_titan_images[] = {R.drawable.titanbesttoo,R.drawable.dtb11, R.drawable.dtb1, R.drawable.dtb2, R.drawable.dtb3
            , R.drawable.dtb4 , R.drawable.dtb5 , R.drawable.dtb6 , R.drawable.dtb7 , R.drawable.dtb8
            , R.drawable.dtb9 , R.drawable.dtb10 , R.drawable.titanbestthree
    };
    int concept_plus_images[] = {R.drawable.con5, R.drawable.con1,  R.drawable.con2
            , R.drawable.con3 , R.drawable.con4
    };

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        viewFlipper = (ViewFlipper) root.findViewById(R.id.viewflip);
        for (int i = 0; i < dimaond_titan_images.length; i++) {
            // This will create dynamic image views and add them to the ViewFlipper.
            setFlipperImage(dimaond_titan_images[i]);
        }
        viewFlippert = (ViewFlipper) root.findViewById(R.id.viewflip2);
        for (int i = 0; i < concept_plus_images.length; i++) {
            // This will create dynamic image views and add them to the ViewFlipper.
            setFlipperImaget(concept_plus_images[i]);
        }

        final TextView titanTextView = root.findViewById(R.id.titan_id);
        titanTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DimaondTitanBest.class);
                startActivity(intent);
            }
        });

        final TextView conceptTextView = root.findViewById(R.id.concept_id);
        conceptTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentt = new Intent(getActivity(), ConceptPlus.class);
                startActivity(intentt);
            }
        });
        viewFlipper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DimaondTitanBest.class);
                startActivity(intent);
            }
        });
        viewFlippert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ConceptPlus.class);
                startActivity(intent);
            }
        });

        return root;
    }

    private void setFlipperImage(int res) {
        Log.i("Set Filpper Called", res + "");
        ImageView image = new ImageView(getContext());
        image.setBackgroundResource(res);
        viewFlipper.addView(image);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);

    }

    private void setFlipperImaget(int res) {
        Log.i("Set Filpper Called", res + "");
        ImageView image = new ImageView(getContext());
        image.setBackgroundResource(res);
        viewFlippert.addView(image);
        viewFlippert.setFlipInterval(3000);
        viewFlippert.setAutoStart(true);

    }


}