package projectp4.studio.com.gerenciador_universitario.Adapter;

import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import projectp4.studio.com.gerenciador_universitario.FragmentFaltas;
import projectp4.studio.com.gerenciador_universitario.FragmentNotas;
import projectp4.studio.com.gerenciador_universitario.FragmentTeste;
import projectp4.studio.com.gerenciador_universitario.Frags;

/**
 * Created by Lucas on 01/05/2018.
 */
public class TabAdapter extends FragmentStatePagerAdapter {
    private String[] tituloAbas ={"NOTAS", "FALTAS"};

    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment f = null;

        if(position == 0){
            f = new FragmentNotas();
        }else{
            f = new FragmentFaltas();
        }

        return f;
    }

    @Override
    public int getCount() {
        return tituloAbas.length;
    }

    @Override
    public CharSequence getPageTitle (int position){
        return tituloAbas[position];
    }
}