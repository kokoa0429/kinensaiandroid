package kokoakobato.myapplication;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class KikakuFragment extends ListFragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public KikakuFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        /*
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(
                        getActivity(),
                        android.R.layout.simple_list_item_1,
                        MyList.Data(getArguments().getInt(ARG_SECTION_NUMBER, 0))
                );
                */
/*
        List<ListItem> list = new ArrayList<ListItem>();

        for (int i = 1; i < 6; i++) {
            ListItem item = new ListItem();
            item.setClassName("2" + i);
            item.setClassImageId(R.drawable.ic_notifications_black_24dp);
            list.add(item);
        }
*/

        KikakuListAdapter adapter =
                new KikakuListAdapter(getActivity(), R.layout.list_view_image_item, /* php get */);

        setListAdapter(adapter);

    }



    public static KikakuFragment newInstance(int sectionNumber) {
        KikakuFragment fragment = new KikakuFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }
}