package husseinm19.github.com.adwliahfinal.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import husseinm19.github.com.adwliahfinal.CertificationActivity;
import husseinm19.github.com.adwliahfinal.OtherProductsBad;
import husseinm19.github.com.adwliahfinal.R;
import husseinm19.github.com.adwliahfinal.UseAndCare;
import husseinm19.github.com.adwliahfinal.titaniuum;

public class DashboardFragment extends Fragment {



    CardView cardView;
    CardView cardView2;
    CardView cardView3;
    CardView cardView4;
    private long mLastClickTime = 0;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        cardView = (CardView) root.findViewById(R.id.cardview_dashboard);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // preventing double, using threshold of 1000 ms
                if (SystemClock.elapsedRealtime() - mLastClickTime < 1000) {
                    return;
                }
                mLastClickTime = SystemClock.elapsedRealtime();
                Intent intent = new Intent(getActivity(), CertificationActivity.class);
                startActivity(intent);
            }
        });

        cardView2 = (CardView) root.findViewById(R.id.cardview_dashboard2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // preventing double, using threshold of 1000 ms
                if (SystemClock.elapsedRealtime() - mLastClickTime < 1000) {
                    return;
                }
                mLastClickTime = SystemClock.elapsedRealtime();
                Intent intent = new Intent(getActivity(), titaniuum.class);
                startActivity(intent);

            }
        });
//
//
//
        cardView3 = (CardView) root.findViewById(R.id.cardview_dashboard3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // preventing double, using threshold of 1000 ms
                if (SystemClock.elapsedRealtime() - mLastClickTime < 1000) {
                    return;
                }
                mLastClickTime = SystemClock.elapsedRealtime();
                Intent intent = new Intent(getActivity(), OtherProductsBad.class);
                startActivity(intent);

            }
        });


        cardView4 = (CardView) root.findViewById(R.id.cardview_dashboard4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // preventing double, using threshold of 1000 ms
                if (SystemClock.elapsedRealtime() - mLastClickTime < 1000) {
                    return;
                }
                mLastClickTime = SystemClock.elapsedRealtime();
                Intent intent = new Intent(getActivity(), UseAndCare.class);
                startActivity(intent);

            }
        });



        return root;


    }

}