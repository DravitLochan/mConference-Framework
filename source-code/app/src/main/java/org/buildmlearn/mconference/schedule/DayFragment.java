package org.buildmlearn.mconference.schedule;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.buildmlearn.mconference.R;
import org.buildmlearn.mconference.adapters.DayRecyclerView;
import org.buildmlearn.mconference.model.TalkDetails;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DayFragment extends Fragment {


    public DayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_day, container, false);
        RecyclerView dayRecyclerView = (RecyclerView) view.findViewById(R.id.day_recycler_view);
        dayRecyclerView.setHasFixedSize(true);
        dayRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        ArrayList<TalkDetails> dummyTalks = new ArrayList<>(3);
        dummyTalks.add(new TalkDetails("Talk #1", "http://blogs.gartner.com/smarterwithgartner/files/2015/03/Guy_Kawasaki_1_inline.jpg",
                "10:00 AM - 11:00 AM", "ALbert Hall", getResources().getString(R.string.lorem)));
        dummyTalks.add(new TalkDetails("Talk #2", "",
                "1:00 PM - 2:00 PM", "Nehru Hall", getResources().getString(R.string.lorem)));
        dummyTalks.add(new TalkDetails("Talk #3", "http://static.dnaindia.com/sites/default/files/styles/half/public/2016/01/12/413826-swami.jpg",
                "3:00 PM - 5:00 AM", "Gandhi Hall", getResources().getString(R.string.lorem)));

        DayRecyclerView dayAdapter = new DayRecyclerView(dummyTalks);
        dayRecyclerView.setAdapter(dayAdapter);

        return view;
    }

}
