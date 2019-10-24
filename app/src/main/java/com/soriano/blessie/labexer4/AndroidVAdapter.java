package com.soriano.blessie.labexer4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;
public class AndroidVAdapter extends ArrayAdapter<AndroidVersions> {

    Context mContext;
    int mResource;
    public AndroidVAdapter(@NonNull Context context, int resource, @NonNull List<AndroidVersions> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        int Logo = getItem(position).getLogo();
        String name = getItem(position).getName();
        String version = getItem(position).getVersion();
        String apiLevel = getItem(position).getApiLevel();
        String releaseDate = getItem(position).getReleaseDate();
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView vName = convertView.findViewById(R.id.vName);
        TextView androidversion = convertView.findViewById(R.id.androidversion);
        TextView apilevel = convertView.findViewById(R.id.apilevel);
        TextView released = convertView.findViewById(R.id.released);
        ImageView logo = convertView.findViewById(R.id.logo);

        vName.setText(name);
        androidversion.setText(version);
        apilevel.setText(apiLevel);
        released.setText(releaseDate);
        logo.setImageResource(Logo);
        return convertView;

    }
}
