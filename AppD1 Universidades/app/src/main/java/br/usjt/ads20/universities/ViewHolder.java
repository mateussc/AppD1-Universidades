package br.usjt.ads20.universities;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Nome: Mateus Santos Carvalho
 * RA: 818229525
 */

public class ViewHolder {
    private ImageView universityPoster;
    private TextView universityName, universityCountry, universityWebPage;

    public ViewHolder(ImageView universityPoster, TextView universityName, TextView universityCountry, TextView universityWebPage) {
        this.universityPoster = universityPoster;
        this.universityName = universityName;
        this.universityWebPage = universityWebPage;
        this.universityCountry = universityCountry;

    }

    public ImageView getUniversityPoster() {
        return universityPoster;
    }

    public void setUniversityPoster(ImageView universityPoster) {
        this.universityPoster = universityPoster;
    }

    public TextView getUniversityCountry() {
        return universityCountry;
    }

    public void setUniversityCountry(TextView universityCountry) {
        this.universityCountry = universityCountry;
    }

    public TextView getUniversityWebPage() {
        return universityWebPage;
    }

    public void setUniversityWebPage(TextView universityWebPage) {
        this.universityWebPage = universityWebPage;
    }

    public TextView getUniversityName() {
        return universityName;
    }

    public void setUniversityName(TextView universityName) {
        this.universityName = universityName;
    }

}