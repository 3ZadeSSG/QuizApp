# QuizApp
This App is developed taking the Project Rubric Guide of Lesson 12:Quiz App of Udacity Android Basics Course.
##Overall Layout
1. App contains total of 10 Question including one question with EditText, one with CheckBox and remaining with RadioBUttons
2. There is two buttons added, one for Submit and one for Reset.
3. On hitting Submit button app with show a toast message about score
  (Update as per mentor feedback i have removed toast message with a code to launch second screen with only one button to share the score using Implict Intent)
4. Reset button will make app to resert to initial state.

## Approach Used
1. For questions and answers "@string/" has been used to store them hence making the code of layout more easy to maintain.
2. Custom styles has been added at @style/" do this way we can only reference the style rather than hard coding each layout.
3. Each required radio button and check box required in answer calculation had been initialized in onCreate method,
  so this way those only be initialized once, thus maintaining optimization in mind.
4. There are no unused variables in code, and even though code is pretty much self explanatory comment had been added at,
  steps where needed, i have kept the mentor feedback in mind which i recivied from my last Cricket Score Keeper App and have covered all of those in this one.
 
##ScreenShot
![alt text](https://github.com/manugond/QuizApp/blob/master/Screenshot01.png)
![alt text](https://github.com/manugond/QuizApp/blob/master/Screenshot1.png)


