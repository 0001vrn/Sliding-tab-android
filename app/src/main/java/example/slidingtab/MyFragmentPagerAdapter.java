package example.slidingtab;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {


    private String[] tabTitles = new String[] {"Frag #1","Frag #2","Frag #3"};
    private Context context;

    public MyFragmentPagerAdapter(FragmentManager fm,Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0)
            return new TabFragment1();
        if(position==1)
            return new TabFragment2();
        if(position==2)
            return new TabFragment3();

        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int pos){
        return tabTitles[pos];
    }
}
