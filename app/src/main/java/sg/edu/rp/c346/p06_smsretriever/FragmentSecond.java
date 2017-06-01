package sg.edu.rp.c346.p06_smsretriever;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSecond extends Fragment {
    Button btnRetrieveSMS;
    TextView tvSMS;
    EditText etWord;

    public FragmentSecond() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        tvSMS = (TextView) view.findViewById(R.id.tvSMS);
        btnRetrieveSMS = (Button) view.findViewById(R.id.btnRetrieveSMS);
        etWord = (EditText) view.findViewById(R.id.etWord);
        return view;
    }

}
