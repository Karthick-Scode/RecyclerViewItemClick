package com.example.animaldiary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecycler_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Data_Model [] my_data = new Data_Model[]{
                new Data_Model("Autumn",
                        "Autumn is the time of year that acts as a transition between summer and winter. The autumn months are the time of the harvest season.",
                         R.drawable.autumn),
                new Data_Model("Branch",
                        "a division or subdivision of the stem or axis of a tree, shrub, or other plant.",
                        R.drawable.branch),
                new Data_Model("Cat",
                        "The cat is similar in anatomy to the other felid species: it has a strong flexible body, quick reflexes, sharp teeth, and retractable claws adapted to killing small prey like mice and rats. Its night vision and sense of smell are well developed.",
                        R.drawable.cat),
                new Data_Model("Diamond",
                        "diamond, a mineral composed of pure carbon. It is the hardest naturally occurring substance known; it is also the most popular gemstone.",
                        R.drawable.diamond),
                new Data_Model("Ribbon",
                        "a woven strip or band of fine material, as silk or rayon, varying in width and finished off at the edges, used for ornament, tying, etc.",
                        R.drawable.ribbon),
                new Data_Model("Skull",
                        "The skull is made up of cranial bones (bones that surround and protect the brain) and facial bones (bones that form the eye sockets, nose, cheeks, jaw, and other parts of the face).",
                        R.drawable.skull),
                new Data_Model("Spike",
                        "A spike is a sharp point, often made of metal or wood, but not always. Hedgehogs have long skinny spikes that keep them from being eaten by predators.",
                        R.drawable.spike)
        };

        myrecycler_view = findViewById(R.id.my_recycler_view);
        Data_Adapter myadapter = new Data_Adapter(my_data);

        myrecycler_view.setLayoutManager(new LinearLayoutManager(this));
        myrecycler_view.setAdapter(myadapter);
    };

}