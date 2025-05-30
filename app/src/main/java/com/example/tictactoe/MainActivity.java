package com.example.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.tictactoe.databinding.ActivityMainBinding;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private final List<int[]> combinationList = new ArrayList<>();
    private int[] boxPositions = {0, 0, 0, 0, 0, 0, 0, 0, 0}; // 9 zeros
    private int playerTurn = 1; // 1 for Player 1 (X), 2 for Player 2 (O)
    private int totalSelectedBoxes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Define winning combinations
        combinationList.add(new int[]{0, 1, 2});
        combinationList.add(new int[]{3, 4, 5});
        combinationList.add(new int[]{6, 7, 8});
        combinationList.add(new int[]{0, 3, 6});
        combinationList.add(new int[]{1, 4, 7});
        combinationList.add(new int[]{2, 5, 8});
        combinationList.add(new int[]{2, 4, 6});
        combinationList.add(new int[]{0, 4, 8});

        // Set player names
        String playerOneName = getIntent().getStringExtra("playerOne");
        String playerTwoName = getIntent().getStringExtra("playerTwo");
        binding.playerOneName.setText(playerOneName);
        binding.playerTwoName.setText(playerTwoName);

        // Set click listeners for each ImageView
        setImageViewClickListener(binding.image1, 0);
        setImageViewClickListener(binding.image2, 1);
        setImageViewClickListener(binding.image3, 2);
        setImageViewClickListener(binding.image4, 3);
        setImageViewClickListener(binding.image5, 4);
        setImageViewClickListener(binding.image6, 5);
        setImageViewClickListener(binding.image7, 6);
        setImageViewClickListener(binding.image8, 7);
        setImageViewClickListener(binding.image9, 8);
    }

    private void setImageViewClickListener(ImageView imageView, int position) {
        imageView.setOnClickListener(view -> {
            if (isBoxSelectable(position)) {
                performAction(imageView, position);
            }
        });
    }

    private void performAction(ImageView imageView, int position) {
        boxPositions[position] = playerTurn;
        imageView.setImageResource(playerTurn == 1 ? R.drawable.ximage : R.drawable.oimage);

        if (checkResults()) {
            String winner = playerTurn == 1 ? binding.playerOneName.getText().toString() : binding.playerTwoName.getText().toString();
            showResultDialog(winner + " is a Winner!");
        } else if (totalSelectedBoxes == 9) {
            showResultDialog("Match Draw");
        } else {
            totalSelectedBoxes++;
            changePlayerTurn(playerTurn == 1 ? 2 : 1);
        }
    }

    private void changePlayerTurn(int currentPlayerTurn) {
        playerTurn = currentPlayerTurn;
        if (playerTurn == 1) {
            binding.playerOneLayout.setBackgroundResource(R.drawable.black_border);
            binding.playerTwoLayout.setBackgroundResource(R.drawable.white_box);
        } else {
            binding.playerTwoLayout.setBackgroundResource(R.drawable.black_border);
            binding.playerOneLayout.setBackgroundResource(R.drawable.white_box);
        }
    }

    private boolean checkResults() {
        for (int[] combination : combinationList) {
            if (boxPositions[combination[0]] == playerTurn &&
                    boxPositions[combination[1]] == playerTurn &&
                    boxPositions[combination[2]] == playerTurn) {
                return true;
            }
        }
        return false;
    }

    private boolean isBoxSelectable(int position) {
        return boxPositions[position] == 0;
    }

    private void showResultDialog(String message) {
        ResultDialog resultDialog = new ResultDialog(MainActivity.this, message, MainActivity.this);
        resultDialog.setCancelable(false);
        resultDialog.show();
    }

    public void restartMatch() {
        boxPositions = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0}; // Reset to 9 zeros
        totalSelectedBoxes = 0;
        playerTurn = 1;

        // Reset all ImageViews to white box
        binding.image1.setImageResource(R.drawable.white_box);
        binding.image2.setImageResource(R.drawable.white_box);
        binding.image3.setImageResource(R.drawable.white_box);
        binding.image4.setImageResource(R.drawable.white_box);
        binding.image5.setImageResource(R.drawable.white_box);
        binding.image6.setImageResource(R.drawable.white_box);
        binding.image7.setImageResource(R.drawable.white_box);
        binding.image8.setImageResource(R.drawable.white_box);
        binding.image9.setImageResource(R.drawable.white_box);

        // Reset player layouts
        binding.playerOneLayout.setBackgroundResource(R.drawable.black_border);
        binding.playerTwoLayout.setBackgroundResource(R.drawable.white_box);
    }
}
