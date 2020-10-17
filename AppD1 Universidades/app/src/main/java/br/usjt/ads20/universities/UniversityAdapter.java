package br.usjt.ads20.universities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import br.usjt.ads20.universities.model.University;

/**
 * Nome: Mateus Santos Carvalho
 * RA: 818229525
 */

public class UniversityAdapter extends BaseAdapter {
    private University[] universities;
    private Context context;

    public UniversityAdapter(Context context, University[] universities) {
        this.universities = universities;
        this.context = context;
    }

    @Override
    public int getCount() {
        return universities.length;
    }

    @Override
    public Object getItem(int index) {
        if (index >= 0 && index < universities.length) return universities[index];
        return null;
    }

    @Override
    public long getItemId(int index) {
        return index;
    }

    @SuppressLint("DefaultLocale")
    @Override
    public View getView(int index, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.activity_university_row, viewGroup, false);

            ImageView universityPoster = view.findViewById(R.id.universityIcon);
            TextView universityName = view.findViewById(R.id.universityName);
            TextView countryDetail = view.findViewById(R.id.universityCountry);
            TextView webPageDetail = view.findViewById(R.id.universityWebPage);
            ViewHolder viewHolder = new ViewHolder(universityPoster, universityName, countryDetail, webPageDetail);
            view.setTag(viewHolder);
        }

        ViewHolder viewHolder = (ViewHolder)view.getTag();
        viewHolder.getUniversityPoster().setImageBitmap(Util.criaAvatar(context, universities[index].getAlphaTwoCode()));
        viewHolder.getUniversityName().setText(universities[index].getName());
        //Locale locale = new Locale("pt", "BR");
        viewHolder.getUniversityCountry().setText(String.format("%s", universities[index].getCountry()));
        viewHolder.getUniversityWebPage().setText(String.format("%s", universities[index].getWebPage()));

        return view;
    }

}