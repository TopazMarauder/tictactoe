package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding: ActivityMainBinding

    var playerOne = true
    var squareOne = 0
    var squareTwo = 0
    var squareThree = 0
    var squareFour = 0
    var squareFive = 0
    var squareSix = 0
    var squareSeven = 0
    var squareEight = 0
    var squareNine = 0

    var testTop= false
    var testMiddle = false
    var testBottom = false
    var testFirst = false
    var testSecond = false
    var testThird = false
    var testDiagonalA = false
    var testDiagonalB = false

    var hasWon = false
    var victoryStates = arrayListOf<String>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        binding.btn1.setOnClickListener(this)
        binding.btn2.setOnClickListener(this)
        binding.btn3.setOnClickListener(this)
        binding.btn4.setOnClickListener(this)
        binding.btn5.setOnClickListener(this)
        binding.btn6.setOnClickListener(this)
        binding.btn7.setOnClickListener(this)
        binding.btn8.setOnClickListener(this)
        binding.btn9.setOnClickListener(this)


    }


    private fun testWin(x : ArrayList<String>, currentPlay : Int): Boolean {
        if ("top" in x){
            testTop= squareOne and squareTwo and squareThree == currentPlay
        }
        if ("middle" in x){
            testMiddle = squareFour and squareFive and squareSix == currentPlay
        }
        if ("bottom" in x){
            testBottom = squareSeven and squareEight and squareNine == currentPlay
        }
        if ("first" in x){
            testFirst = squareOne and squareFour and squareSeven == currentPlay
        }
        if ("second" in x){
            testSecond = squareTwo and squareFive and squareEight == currentPlay
        }
        if ("third" in x){
            testThird = squareThree and squareSix and squareNine == currentPlay
        }
        if ("diagonala" in x){
            testDiagonalA = squareOne and squareSix and squareNine == currentPlay
        }
        if ("diagonalb" in x){
            testDiagonalB = squareThree and squareSix and squareSeven == currentPlay
        }
        var trueTest = testTop or testMiddle or testBottom or testFirst or testSecond or testThird or testDiagonalA or testDiagonalB
        return trueTest ?: false
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_1 -> {
                victoryStates= arrayListOf("first", "top", "diagonala")
                if (squareOne == 0) {
                    if (playerOne) {
                        binding.btn1.setBackgroundResource(R.drawable.ic_o)
                        squareOne = 1
                        hasWon= testWin(victoryStates, 1)

                        if (hasWon) {
                            binding.tvTitle.text = "Player 1 Win!"
                        }
                    }
                    else if (!playerOne) {
                        binding.btn1.setBackgroundResource(R.drawable.ic_x)
                        squareOne = 2
                        hasWon= testWin(x= victoryStates,currentPlay= 2 )

                        if (hasWon) {
                            binding.tvTitle.text = "Player 2 Win!"
                        }
                    }

                    playerOne = !playerOne
                }
            }



            R.id.btn_2 -> {
                if (squareTwo == 0) {
                    victoryStates = arrayListOf("second", "top")
                    if (playerOne) {
                        binding.btn2.setBackgroundResource(R.drawable.ic_o)
                        squareTwo = 1
                        hasWon= testWin(victoryStates,1 )

                        if (hasWon) {
                            binding.tvTitle.text = "Player 1 Win!"
                        }
                    }
                    else if (!playerOne) {
                        binding.btn2.setBackgroundResource(R.drawable.ic_x)
                        squareTwo = 2
                        hasWon= testWin(victoryStates,currentPlay= 2 )

                        if (hasWon) {
                            binding.tvTitle.text = "Player 2 Win!"
                        }
                    }

                    playerOne = !playerOne
                }
            }

            R.id.btn_3 -> {
                if (squareThree == 0) {
                    victoryStates = arrayListOf("third", "top", "diagonalb")
                    if (playerOne) {
                        binding.btn3.setBackgroundResource(R.drawable.ic_o)
                        squareThree = 1
                        hasWon= testWin(victoryStates,1 )

                        if (hasWon) {
                            binding.tvTitle.text = "Player 1 Win!"
                        }
                    }
                    else if (!playerOne) {
                        binding.btn3.setBackgroundResource(R.drawable.ic_x)
                        squareThree = 2
                        hasWon= testWin(victoryStates,currentPlay= 2 )

                        if (hasWon) {
                            binding.tvTitle.text = "Player 2 Win!"
                        }
                    }

                    playerOne = !playerOne
                }
            }

            R.id.btn_4 -> {
                if (squareFour == 0) {
                    victoryStates = arrayListOf("first", "middle")
                    if (playerOne) {
                        binding.btn4.setBackgroundResource(R.drawable.ic_o)
                        squareFour = 1
                        hasWon= testWin(victoryStates,1 )

                        if (hasWon) {
                            binding.tvTitle.text = "Player 1 Win!"
                        }
                    }
                    else if (!playerOne) {
                        binding.btn4.setBackgroundResource(R.drawable.ic_x)
                        squareFour = 2
                        hasWon= testWin(victoryStates,currentPlay= 2 )

                        if (hasWon) {
                            binding.tvTitle.text = "Player 2 Win!"
                        }
                    }

                    playerOne = !playerOne
                }
            }
            R.id.btn_5 -> {
                if (squareFive == 0) {
                    victoryStates = arrayListOf("second", "middle","diagonala", "diagonalb")
                    if (playerOne) {
                        binding.btn5.setBackgroundResource(R.drawable.ic_o)
                        squareFive = 1
                        hasWon= testWin(victoryStates,1 )

                        if (hasWon) {
                            binding.tvTitle.text = "Player 1 Win!"
                        }
                    }
                    else if (!playerOne) {
                        binding.btn5.setBackgroundResource(R.drawable.ic_x)
                        squareFive = 2
                        hasWon= testWin(victoryStates,currentPlay= 2 )

                        if (hasWon) {
                            binding.tvTitle.text = "Player 2 Win!"
                        }
                    }

                    playerOne = !playerOne
                }
            }

            R.id.btn_6 -> {
                if (squareSix == 0) {
                    victoryStates = arrayListOf("third", "middle")
                    if (playerOne) {
                        binding.btn6.setBackgroundResource(R.drawable.ic_o)
                        squareSix = 1
                        hasWon= testWin(victoryStates,1 )

                        if (hasWon) {
                            binding.tvTitle.text = "Player 1 Win!"
                        }
                    }
                    else if (!playerOne) {
                        binding.btn6.setBackgroundResource(R.drawable.ic_x)
                        squareSix = 2
                        hasWon= testWin(victoryStates,currentPlay= 2 )

                        if (hasWon) {
                            binding.tvTitle.text = "Player 2 Win!"
                        }
                    }

                    playerOne = !playerOne
                }
            }
            R.id.btn_7 -> {
                if (squareSeven == 0) {
                    victoryStates = arrayListOf("first", "bottom", "diagonalb")
                    if (playerOne) {
                        binding.btn7.setBackgroundResource(R.drawable.ic_o)
                        squareSeven = 1
                        hasWon= testWin(victoryStates,1 )

                        if (hasWon) {
                            binding.tvTitle.text = "Player 1 Win!"
                        }
                    }
                    else if (!playerOne) {
                        binding.btn7.setBackgroundResource(R.drawable.ic_x)
                        squareSeven = 2
                        hasWon= testWin(victoryStates,currentPlay= 2 )

                        if (hasWon) {
                            binding.tvTitle.text = "Player 2 Win!"
                        }
                    }

                    playerOne = !playerOne
                }
            }
            R.id.btn_8 -> {
                if (squareEight == 0) {
                    victoryStates = arrayListOf("second", "bottom")
                    if (playerOne) {
                        binding.btn8.setBackgroundResource(R.drawable.ic_o)
                        squareEight = 1
                        hasWon= testWin(victoryStates,1 )

                        if (hasWon) {
                            binding.tvTitle.text = "Player 1 Win!"
                        }
                    }
                    else if (!playerOne) {
                        binding.btn8.setBackgroundResource(R.drawable.ic_x)
                        squareEight = 2
                        hasWon= testWin(victoryStates,currentPlay= 2 )

                        if (hasWon) {
                            binding.tvTitle.text = "Player 2 Win!"
                        }
                    }

                    playerOne = !playerOne
                }
            }
            R.id.btn_9 -> {
                if (squareNine == 0) {
                    victoryStates = arrayListOf("third", "bottom", "diagonala")
                    if (playerOne) {
                        binding.btn9.setBackgroundResource(R.drawable.ic_o)
                        squareNine = 1
                        hasWon= testWin(victoryStates,1 )

                        if (hasWon) {
                            binding.tvTitle.text = "Player 1 Win!"
                        }
                    }
                    else if (!playerOne) {
                        binding.btn9.setBackgroundResource(R.drawable.ic_x)
                        squareNine = 2
                        hasWon= testWin(victoryStates,currentPlay= 2 )

                        if (hasWon) {
                            binding.tvTitle.text = "Player 2 Win!"
                        }
                    }

                    playerOne = !playerOne
                }
            }
        }
    }


}