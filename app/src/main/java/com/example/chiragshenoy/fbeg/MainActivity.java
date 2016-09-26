package com.example.chiragshenoy.fbeg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Exam> examList = new ArrayList<>();
    ArrayList<Subject> subjectList = new ArrayList<>();
    ArrayList<Topic> topicList = new ArrayList<>();

    ArrayList<Long> exam_ids;
    ArrayList<Long> subject_ids;
    ArrayList<Long> topic_ids;

    TextView tv;

    String egTopics = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);

        subject_ids = new ArrayList<>();
        topic_ids = new ArrayList<>();


        tv = (TextView) findViewById(R.id.tv);

        DatabaseReference scoresRef = FirebaseDatabase.getInstance().getReference();
        scoresRef.keepSynced(true);


        String sl = "11";

        scoresRef.child("study_levels").child(sl).child("exam_ids").addListenerForSingleValueEvent(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        exam_ids = (ArrayList<Long>) dataSnapshot.getValue();
                        for (Long l : exam_ids) {
                            Log.e("Exam ids are ", l + "");
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError firebaseError) {
                    }

                });


        //Get all Exams
        scoresRef.child("exams").addListenerForSingleValueEvent(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        Log.e("Number of exams", dataSnapshot.getChildrenCount() + "");
                        for (DataSnapshot d : dataSnapshot.getChildren()) {
                            Exam e = d.getValue(Exam.class);

                            if (exam_ids.contains(e.getId())) {
                                Log.e("Added exam name ", e.getId() + "");
                                examList.add(e);
                                subject_ids.addAll(e.getSubject_ids());
                            }
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError firebaseError) {
                    }

                });



//        Get all Subjects
        scoresRef.child("subjects").addListenerForSingleValueEvent(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        Log.e("Number of Subjects", dataSnapshot.getChildrenCount() + "");


                        for (Long l : subject_ids)
                            Log.e("Subject id", l + " ");

                        for (DataSnapshot d : dataSnapshot.getChildren()) {
                            Subject s = d.getValue(Subject.class);

                            if (subject_ids.contains(s.getId())) {
                                subjectList.add(s);
                                topic_ids.addAll(s.getTopic_ids());
                                Log.e("Added subject ", s.getId() + "");
                            }
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError firebaseError) {
                    }
                });

        //Get all Topics
        scoresRef.child("topics").addListenerForSingleValueEvent(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // Get user value

                        Log.e("Number of topics", dataSnapshot.getChildrenCount() + "");

                        for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
                            Topic topic = postSnapshot.getValue(Topic.class);

                            if (topic_ids.contains(topic.getId())) {
                                Log.e("Added topic", topic.getName());
                                topicList.add(topic);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }
                });

    }

}
