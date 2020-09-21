package com.example.manpreetparmar_ceng319lab1;


import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class ActvityFrag extends Fragment
{
    public TextView display;

    public ActvityFrag()
    {
   }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)  //Toast onCreateView() used to display toast for Actvity fragment when  onCreateView()  is executed
    {
        String string ;
        string = getString(R.string.activity)+""+getString(R.string.onCreate);//gets text from string.xml

        View view = inflater.inflate(R.layout.activity_frag, container, false);
        // display Toast with fragment life status
        Toast toast = Toast.makeText(getContext(),string,Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();

        final ListView listView = view.findViewById(R.id.list);
        listView.setSelector(android.R.color.holo_blue_dark);
        listView.setOnItemClickListener( new AdapterView.OnItemClickListener()
                {
                    @Override
                    public void onItemClick(AdapterView parent, View view, int position, long id)
                    {
                        if (position == 0)
                        {
                            display = (TextView) getActivity().findViewById(R.id.mainview);
                            display.setText("");
                            display.append(getString(R.string.main));
                            Intent intent = new Intent(getActivity(), AIActivity.class);
                            intent.putExtra("activity", "AIActivity");
                            startActivity(intent);
                        }
                        if (position == 1)
                        {
                            display = (TextView) getActivity().findViewById(R.id.mainview);
                            display.setText("");
                            display.append(getString(R.string.main));
                            Intent intent = new Intent(getActivity(), VRActivity.class);
                            intent.putExtra("activity", "VRActivity");
                            startActivity(intent);
                        }
                    }
                }
        );

        return view;
    }

    @Override
    public void onStart() //Toast onstart() used to display toast for Actvity fragment when  onStart()  is executed
    {
        super.onStart();
        String string ;
        string = getString(R.string.activity)+""+getString(R.string.onStart);//gets text from string.xml

        // display Toast with fragment life status
        Toast toast = Toast.makeText(getContext(), string, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();
    }

}
