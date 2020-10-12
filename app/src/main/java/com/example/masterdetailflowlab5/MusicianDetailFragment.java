package com.example.masterdetailflowlab5;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.masterdetailflowlab5.dummy.DummyContent;

/**
 * A fragment representing a single Musician detail screen.
 * This fragment is either contained in a {@link MusicianListActivity}
 * in two-pane mode (on tablets) or a {@link MusicianDetailActivity}
 * on handsets.
 */
public class MusicianDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private DummyContent.DummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public MusicianDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.content);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.musician_detail, container, false);

        // Show the dummy content as text in a TextView.
        if (mItem != null) {

            if(mItem.id.equals("1")){
                rootView= inflater.inflate(R.layout.cudi,container,false);
            }
            if(mItem.id.equals("2")){
                rootView= inflater.inflate(R.layout.frank,container,false);
            }
            if(mItem.id.equals("3")){
                rootView= inflater.inflate(R.layout.joji,container,false);
            }
            if(mItem.id.equals("4")){
                rootView= inflater.inflate(R.layout.mac,container,false);
            }
            if(mItem.id.equals("5")){
                rootView= inflater.inflate(R.layout.peggy,container,false);
            }
            if(mItem.id.equals("6")){
                rootView= inflater.inflate(R.layout.uzi,container,false);
            }
            if(mItem.id.equals("7")){
                rootView= inflater.inflate(R.layout.weeknd,container,false);
            }
            if(mItem.id.equals("8")){
                rootView= inflater.inflate(R.layout.yachty,container,false);
            }
            if(mItem.id.equals("9")){
                rootView= inflater.inflate(R.layout.tscott,container,false);
            }
           // ((TextView) rootView.findViewById(R.id.musician_detail)).setText(mItem.details);
        }

        return rootView;
    }
}