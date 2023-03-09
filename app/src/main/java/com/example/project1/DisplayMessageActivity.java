package com.example.project1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Placeholder;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    String currentMessageText, previousMessageText;
    static final String PREVIOUS_MESSAGE = "previousMessage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        // Получение сообщения из Intent
        Intent intent = getIntent();
        currentMessageText = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        // Создание объекта TextView для вывода текущего сообщения
        TextView currentMessage = findViewById(R.id.current_message_text);
        currentMessage.setText(currentMessageText);

        // Создание объекта TextView для вывода предыдущего сообщения
        TextView previousMessage = findViewById(R.id.previous_message_text);
        if (savedInstanceState != null) {
            previousMessageText = savedInstanceState.getString(PREVIOUS_MESSAGE);
            previousMessage.setText(previousMessageText);
        } else {

        }

//        textView.setTextSize(40);
//        textView.setGravity(Gravity.CENTER);

        // Установка textView корневым элементом разметки activity
//        setContentView(textView);



//        setContentView(R.layout.activity_display_message);
//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                    .add(R.id.container, new PlaceholderFragment()).commit();
//        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString(PREVIOUS_MESSAGE, currentMessageText);
    }

    //    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//        if (id == R.id.action_settings) {
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
//
//    public static class PlaceHolderFragment extends Fragment {
//        public PlaceHolderFragment() {}
//        @Override
//        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//            View rootView = inflater.inflate(R.layout.fragment_display_message, container, false);
//            return rootView;
//        }
//    }
}