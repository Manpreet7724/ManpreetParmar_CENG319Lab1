package com.example.manpreetparmar_ceng319lab1;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class DisplayFrag extends Fragment
{
    public TextView display;
    public DisplayFrag()
    {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)//Toast onCreateView() used to display toast for display fragment when  onCreateView() is executed
    {
        String string ;
        string = getString(R.string.display)+""+getString(R.string.onCreate);//gets text from string.xml

        // display Toast with fragment life status
        Toast toast = Toast.makeText(getContext(), string, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.display_frag, container, false);
    }

    @Override
    public void onStart() //Toast onstart() used to display toast for display fragment when  onStart()  is executed
    {
        super.onStart();
        String string;

        // display Toast with fragment life status
        Toast toast = Toast.makeText(getContext(),getString(R.string.display)+""+getString(R.string.onStart), Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();
    }
    public void displaymain (String temp)  // used to appends to mainview display
    {
        display = (TextView) getActivity().findViewById(R.id.mainview);
        display.append(temp);
    }
    public  void clear() // used to clear mainview display
    {
        display = (TextView) getActivity().findViewById(R.id.mainview);
        display.setText("");
    }

}
